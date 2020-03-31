package ch.tbz.cinema.domainModels.movie;

import ch.tbz.cinema.config.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name="movie")
public class Movie extends ExtendedEntity {
    @Column(name = "title", nullable=false)
    private String title;

    @Column(name = "director", nullable=false)
    private String director;

    @Column(name = "duration", nullable=false)
    private Time duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }
}
