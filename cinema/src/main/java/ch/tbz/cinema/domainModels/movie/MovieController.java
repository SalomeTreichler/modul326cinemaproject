package ch.tbz.cinema.domainModels.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

  private MovieService movieService;

  @Autowired
  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @GetMapping("/desc")
  public @ResponseBody
  ResponseEntity<List<Movie>> getMoviesSortByTitleDesc() {
    List<Movie> movieList = movieService.sortListByTitleDesc();
    return new ResponseEntity<List<Movie>>(movieList, HttpStatus.OK);
  }

  // localhost:8080/products/asc  GET
  @GetMapping("/asc")
  public @ResponseBody
  ResponseEntity<List<Movie>> getMoviesSortByTitleAsc() {
    List<Movie> movieList = movieService.sortListByTitleAsc();
    return new ResponseEntity<List<Movie>>(movieList, HttpStatus.OK);
  }

  @GetMapping("")
  public @ResponseBody
  ResponseEntity<List<Movie>> getMovies() {
    List<Movie> movieList = movieService.getAllMovies();
    return new ResponseEntity<List<Movie>>(movieList, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public @ResponseBody
  ResponseEntity<Movie> getById(@PathVariable String id) {
    return new ResponseEntity<Movie>(movieService.getMovieById(id), HttpStatus.OK);
  }

  @PostMapping("")
  public @ResponseBody
  ResponseEntity<Movie> createMovie(@RequestBody Movie newMovie) {
    return new ResponseEntity<>(movieService.insertMovie(newMovie), HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public @ResponseBody
  ResponseEntity<Movie> updateMovie (@PathVariable String id, @RequestBody Movie newMovie) {
    return new ResponseEntity<Movie>(movieService.updateMovie(id, newMovie), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public @ResponseBody ResponseEntity<String> deleteMovie (@PathVariable String id) {
    return new ResponseEntity<>(movieService.deleteMovieById(id), HttpStatus.OK);
  }
}
