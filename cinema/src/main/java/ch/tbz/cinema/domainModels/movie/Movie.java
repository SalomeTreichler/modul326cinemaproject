package ch.tbz.cinema.domainModels.movie;

import ch.tbz.cinema.config.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie extends ExtendedEntity {
    @Column(name = "title")
    private String title;
}
