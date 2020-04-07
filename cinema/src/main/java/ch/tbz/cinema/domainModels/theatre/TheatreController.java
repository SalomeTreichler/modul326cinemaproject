package ch.tbz.cinema.domainModels.theatre;

import ch.tbz.cinema.domainModels.theatre.dto.TheatreDTO;
import ch.tbz.cinema.domainModels.theatre.dto.TheatreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theatres")
public class TheatreController {

  private TheatreService theatreService;
  private TheatreMapper theatreMapper;

  @Autowired
  public TheatreController(TheatreService theatreService, TheatreMapper theatreMapper) {
    this.theatreService = theatreService;
    this.theatreMapper = theatreMapper;
  }

  @GetMapping("")
  public @ResponseBody
  ResponseEntity<List<TheatreDTO>> getTheatres() {
    return new ResponseEntity<List<TheatreDTO>>(theatreMapper.toDTOs(theatreService.getAllTheatres()), HttpStatus.OK);
  }

  @GetMapping("/desc")
  public @ResponseBody
  ResponseEntity<List<TheatreDTO>> getTheatresSortByNameDesc() {
    return new ResponseEntity<List<TheatreDTO>>(theatreMapper.toDTOs(theatreService.sortListByNameAsc()), HttpStatus.OK);
  }

  @GetMapping("/asc")
  public @ResponseBody
  ResponseEntity<List<TheatreDTO>> getTheatresSortByNameAsc() {
    return new ResponseEntity<List<TheatreDTO>>(theatreMapper.toDTOs(theatreService.sortListByNameAsc()), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public @ResponseBody
  ResponseEntity<TheatreDTO> getById(@PathVariable String id) {
    return new ResponseEntity<TheatreDTO>(theatreMapper.toDTO(theatreService.getTheatreById(id)), HttpStatus.OK);
  }

  @PostMapping("")
  public @ResponseBody
  ResponseEntity<TheatreDTO> createTheatre(@RequestBody TheatreDTO theatreDTO) {
    return new ResponseEntity<>(theatreMapper.toDTO(theatreService.insertTheatre(theatreMapper.fromDTO(theatreDTO))), HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public @ResponseBody
  ResponseEntity<TheatreDTO> updateTheatre(@PathVariable String id, @RequestBody TheatreDTO theatreDTO) {
    return new ResponseEntity<TheatreDTO>(theatreMapper.toDTO(theatreService.updateTheatre(id, theatreMapper.fromDTO(theatreDTO))), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public @ResponseBody
  ResponseEntity<String> deleteTheatre(@PathVariable String id) {
    return new ResponseEntity<>(theatreService.deleteTheatreById(id), HttpStatus.OK);
  }
}
