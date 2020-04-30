package ch.tbz.cinema.domainModels.booking;

import ch.tbz.cinema.domainModels.seat.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

  private BookingRepository bookingRepository;

  @Autowired
  public BookingServiceImpl(BookingRepository bookingRepository) {
    this.bookingRepository = bookingRepository;
  }

  @Override
  public List<Booking> getAllBookings() {
    return bookingRepository.findAll();
  }

  @Override
  public Booking getBookingById(String id) {
    return bookingRepository.findById(id).orElse(null);
  }

  @Override
  public Booking insertBooking(Booking newBooking) {
    try{
      for (Seat seat: newBooking.getSeats()) {
        if(seat.isBooked()){
          throw new OccupiedSeatException("A seat in the Booking is already occupied");
        }
      }
      newBooking.getSeats().forEach(seat -> seat.setBooked(true));
      return bookingRepository.save(newBooking);
    }catch(OccupiedSeatException e){
      newBooking.setId("failed to insert booking because a seat is already booked");
      return newBooking;
    }
  }

  @Override
  public String deleteBookingById(String id) {
    bookingRepository.deleteById(id);
    return "The Booking has been deleted successfully";
  }
}
