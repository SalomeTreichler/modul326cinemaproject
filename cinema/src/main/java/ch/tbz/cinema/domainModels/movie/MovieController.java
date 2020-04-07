package ch.tbz.cinema.domainModels.movie;

import ch.tbz.cinema.domainModels.movie.dto.MovieDTO;
import ch.tbz.cinema.domainModels.movie.dto.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

  private MovieService movieService;

  private MovieMapper movieMapper;

  @Autowired
  public MovieController(MovieService movieService, MovieMapper movieMapper) {
    this.movieService = movieService;
    this.movieMapper = movieMapper;
  }

  @GetMapping("")
  public @ResponseBody
  ResponseEntity<List<MovieDTO>> getMovies() {
    return new ResponseEntity<List<MovieDTO>>(movieMapper.toDTOs(movieService.getAllMovies()), HttpStatus.OK);
  }

  @GetMapping("/desc")
  public @ResponseBody
  ResponseEntity<List<MovieDTO>> getMoviesSortByTitleDesc() {
    return new ResponseEntity<List<MovieDTO>>(movieMapper.toDTOs(movieService.sortListByTitleDesc()), HttpStatus.OK);
  }

  @GetMapping("/asc")
  public @ResponseBody
  ResponseEntity<List<MovieDTO>> getMoviesSortByTitleAsc() {
    return new ResponseEntity<List<MovieDTO>>(movieMapper.toDTOs(movieService.sortListByTitleAsc()), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public @ResponseBody
  ResponseEntity<MovieDTO> getById(@PathVariable String id) {
    return new ResponseEntity<MovieDTO>(movieMapper.toDTO(movieService.getMovieById(id)), HttpStatus.OK);
  }

  @PostMapping("")
  public @ResponseBody
  ResponseEntity<MovieDTO> createMovie(@RequestBody MovieDTO movieDTO) {
    return new ResponseEntity<>(movieMapper.toDTO(movieService.insertMovie(movieMapper.fromDTO(movieDTO))), HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public @ResponseBody
  ResponseEntity<MovieDTO> updateMovie(@PathVariable String id, @RequestBody MovieDTO movieDTO) {
    return new ResponseEntity<MovieDTO>(movieMapper.toDTO(movieService.updateMovie(id, movieMapper.fromDTO(movieDTO))), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public @ResponseBody
  ResponseEntity<String> deleteMovie(@PathVariable String id) {
    return new ResponseEntity<>(movieService.deleteMovieById(id), HttpStatus.OK);
  }
}
