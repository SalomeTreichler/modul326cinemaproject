package ch.tbz.cinema.domainModels.booking.dto;

import ch.tbz.cinema.domainModels.costumer.Costumer;
import ch.tbz.cinema.domainModels.screening.Screening;
import ch.tbz.cinema.domainModels.seat.Seat;

import java.util.Set;

public class BookingDTO {

  private String id;

  private Costumer costumer;

  private Screening screening;

  private Set<Seat> seats;

  public BookingDTO() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Costumer getCostumer() {
    return costumer;
  }

  public void setCostumer(Costumer costumer) {
    this.costumer = costumer;
  }

  public Screening getScreening() {
    return screening;
  }

  public void setScreening(Screening screening) {
    this.screening = screening;
  }

  public Set<Seat> getSeats() {
    return seats;
  }

  public void setSeats(Set<Seat> seats) {
    this.seats = seats;
  }
}
