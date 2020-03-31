package ch.tbz.cinema.domainModels.theatre;

import ch.tbz.cinema.config.generic.ExtendedEntity;
import ch.tbz.cinema.domainModels.seat.Seat;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "theatre")
public class Theatre extends ExtendedEntity {
  @Column(name = "name")
  private String name;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
      name = "theatre_seat",
      joinColumns = @JoinColumn(name = "theatre_id"),
      inverseJoinColumns = @JoinColumn(name = "seat_id")
  )
  private Set<Seat> seats;

  public Theatre() {
  }

  public Theatre(String id) {
    super(id);
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
