package ch.tbz.cinema.domainModels.screening;

import ch.tbz.cinema.domainModels.screening.dto.ScreeningDTO;
import ch.tbz.cinema.domainModels.screening.dto.ScreeningMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/screenings")
public class ScreeningController {

    private ScreeningService screeningService;
    private ScreeningMapper screeningMapper;

    @Autowired
    public ScreeningController(ScreeningService screeningService, ScreeningMapper screeningMapper) {
        this.screeningService = screeningService;
        this.screeningMapper = screeningMapper;
    }

    // localhost:8080/costumers  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<ScreeningDTO>> getAll() {
        return new ResponseEntity<>(screeningMapper.toDTOs(screeningService.getAllScreenings()), HttpStatus.OK);
    }

    // localhost:8080/costumers/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<ScreeningDTO> getById(@PathVariable String id) {
        return new ResponseEntity<ScreeningDTO>(screeningMapper.toDTO(screeningService.getScreeningById(id)), HttpStatus.OK);
    }

    // localhost:8080/costumers POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<ScreeningDTO> create(@RequestBody ScreeningDTO screeningDTO) {
        return new ResponseEntity<ScreeningDTO>(screeningMapper.toDTO(screeningService.insertScreening(screeningMapper.fromDTO(screeningDTO))), HttpStatus.CREATED);
    }

    //localhost:8080/costumers UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<ScreeningDTO> update(@PathVariable String id, @RequestBody ScreeningDTO screeningDTO){
        return new ResponseEntity<ScreeningDTO>(screeningMapper.toDTO(screeningService.updateScreening(id, screeningMapper.fromDTO(screeningDTO))), HttpStatus.OK);
    }

    // localhost:8080/costumers/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(screeningService.deleteScreening(id), HttpStatus.OK);
    }
}
