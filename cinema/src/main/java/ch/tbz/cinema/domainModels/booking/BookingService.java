package ch.tbz.cinema.domainModels.booking;

import ch.tbz.cinema.domainModels.movie.Movie;

import java.util.List;

public interface BookingService {

  public List<Booking> getAllBookings();

  public Booking getBookingById(String id);

  Booking insertBooking (Booking newBooking);

  Booking updateBooking (String id, Booking newBooking);

  String deleteBookingById (String id);
}
