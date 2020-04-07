package ch.tbz.cinema.domainModels.seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SeatServiceImpl implements SeatService{

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    @Override
    public Seat getSeatById(String id) {
        return seatRepository.findById(id).get();
    }

    @Override
    public Seat insertSeat(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public Seat updateSeat(String id, Seat seat) {
        if(seatRepository.existsById(id)) {
            seat.setId(id);
            seatRepository.save(seat);

            return seat;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    @Override
    public String deleteSeat(String id) {
        seatRepository.deleteById(id);
        return "Seat has been deleted";
    }
}
