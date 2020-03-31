package ch.tbz.cinema.domainModels.seat;

import ch.tbz.cinema.config.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "seat")
public class Seat extends ExtendedEntity {
  @Column(name = "seat_number", nullable = false)
  private int seatNumber;

  @Column(name = "row_number", nullable = false)
  private int rowNumber;

  @Column(name = "booked", nullable = false)
  private boolean booked;

  public Seat() {
  }

  public Seat(String id) {
    super(id);
  }

  public int getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }

  public int getRowNumber() {
    return rowNumber;
  }

  public void setRowNumber(int rowNumber) {
    this.rowNumber = rowNumber;
  }

  public boolean isBooked() {
    return booked;
  }

  public void setBooked(boolean booked) {
    this.booked = booked;
  }
}
