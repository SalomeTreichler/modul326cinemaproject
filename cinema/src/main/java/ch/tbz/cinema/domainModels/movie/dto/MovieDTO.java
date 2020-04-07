package ch.tbz.cinema.domainModels.movie.dto;

import java.sql.Time;

public class MovieDTO {

  private String id;

  private String title;

  private String director;

  private Time duration;

  public MovieDTO() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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
