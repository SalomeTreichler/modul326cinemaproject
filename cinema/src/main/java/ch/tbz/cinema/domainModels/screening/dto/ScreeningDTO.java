package ch.tbz.cinema.domainModels.screening.dto;

import ch.tbz.cinema.domainModels.movie.Movie;
import ch.tbz.cinema.domainModels.theatre.Theatre;

import java.util.Date;

public class ScreeningDTO {
    private String id;
    private Movie movie;
    private Theatre theatre;
    private Date dateAndTime;

    public ScreeningDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
