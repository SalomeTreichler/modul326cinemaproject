package ch.tbz.cinema.domainModels.booking;

public class OccupiedSeatException extends RuntimeException{
    public OccupiedSeatException(String message) {
        super(message);
    }
}
