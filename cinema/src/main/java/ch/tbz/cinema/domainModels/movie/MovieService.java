package ch.tbz.cinema.domainModels.movie;

import java.util.List;

public interface MovieService {

  public List<Movie> sortListByTitleAsc();

  public List<Movie> sortListByTitleDesc();

  public List<Movie> getAllMovies();

  public Movie getMovieById(String id);

  Movie insertMovie (Movie newMovie);

  Movie updateMovie (String id, Movie newMovie);

  String deleteMovieById (String id);
}
