package ch.tbz.cinema.domainModels.seat;

import java.util.List;

public interface SeatService {
    //returns all Seats
    public List<Seat> getAllSeats();

    //returns a Seat by id
    public Seat getSeatById(String id);

    //inserts new Seat
    public Seat insertSeat(Seat seat);

    //update a Seat by id
    public Seat updateSeat(String id, Seat seat);

    //deletes a Seat by id
    public String deleteSeat(String id);
}
