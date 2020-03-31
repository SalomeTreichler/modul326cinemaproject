package ch.tbz.cinema.domainModels.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

  private MovieRepository movieRepository;

  @Autowired
  public MovieServiceImpl(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  @Override
  public List<Movie> sortListByTitleAsc() {
    List<Movie> movieList = movieRepository.findAll();
    movieList.sort(Comparator.comparing(Movie::getTitle));
    return movieList;
  }

  @Override
  public List<Movie> sortListByTitleDesc() {
    List<Movie> movieList = movieRepository.findAll();
    movieList.sort(Comparator.comparing(Movie::getTitle).reversed());
    return movieList;
  }

  @Override
  public List<Movie> getAllMovies() {
    return movieRepository.findAll();
  }

  @Override
  public Movie getMovieById(String id) {
    return movieRepository.findById(id).orElse(null);
  }

  @Override
  public Movie insertMovie(Movie newMovie) {
    return movieRepository.save(newMovie);
  }

  @Override
  public Movie updateMovie(String id, Movie newMovie) {
    return movieRepository.save(newMovie);
  }

  @Override
  public String deleteMovieById(String id) {
    movieRepository.deleteById(id);
    return "The Movie has been deleted successfully";
  }
}
