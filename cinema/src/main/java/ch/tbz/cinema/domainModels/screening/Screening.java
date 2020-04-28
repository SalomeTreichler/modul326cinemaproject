package ch.tbz.cinema.domainModels.screening;

import ch.tbz.cinema.config.generic.ExtendedEntity;
import ch.tbz.cinema.domainModels.movie.Movie;
import ch.tbz.cinema.domainModels.theatre.Theatre;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="screening")
public class Screening extends ExtendedEntity {
    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name="movie_id", referencedColumnName = "id")
    private Movie movie;

    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name="theatre_id", referencedColumnName = "id")
    private Theatre theatre;

    @Column(name="date_and_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateAndTime;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
