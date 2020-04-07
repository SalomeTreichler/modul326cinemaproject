package ch.tbz.cinema.domainModels.theatre.dto;

import ch.tbz.cinema.domainModels.seat.Seat;

import java.util.Set;

public class TheatreDTO {

  private String id;

  private String name;

  private Set<Seat> seats;

  public TheatreDTO() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Seat> getSeats() {
    return seats;
  }

  public void setSeats(Set<Seat> seats) {
    this.seats = seats;
  }
}
