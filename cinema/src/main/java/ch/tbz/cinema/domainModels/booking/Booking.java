package ch.tbz.cinema.domainModels.booking;

import ch.tbz.cinema.config.generic.ExtendedEntity;
import ch.tbz.cinema.domainModels.costumer.Costumer;
import ch.tbz.cinema.domainModels.movie.Movie;
import ch.tbz.cinema.domainModels.screening.Screening;
import ch.tbz.cinema.domainModels.seat.Seat;
import ch.tbz.cinema.domainModels.theatre.Theatre;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "booking")
public class Booking extends ExtendedEntity {
    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name="costumer_id", referencedColumnName = "id")
    private Costumer costumer;

    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name="screening_id", referencedColumnName = "id")
    private Screening screening;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "booking_seat",
            joinColumns = @JoinColumn(name = "booking_id"),
            inverseJoinColumns = @JoinColumn(name = "seat_id")
    )
    private Set<Seat> seats;

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
