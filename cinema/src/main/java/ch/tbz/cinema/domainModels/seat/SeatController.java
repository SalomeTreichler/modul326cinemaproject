package ch.tbz.cinema.domainModels.seat;

import ch.tbz.cinema.domainModels.seat.dto.SeatDTO;
import ch.tbz.cinema.domainModels.seat.dto.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {

    private SeatService seatService;
    private SeatMapper seatMapper;

    @Autowired
    public SeatController(SeatService seatService, SeatMapper seatMapper) {
        this.seatService = seatService;
        this.seatMapper = seatMapper;
    }

    // localhost:8080/costumers  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<SeatDTO>> getAll() {
        return new ResponseEntity<>(seatMapper.toDTOs(seatService.getAllSeats()), HttpStatus.OK);
    }

    // localhost:8080/costumers/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<SeatDTO> getById(@PathVariable String id) {
        return new ResponseEntity<SeatDTO>(seatMapper.toDTO(seatService.getSeatById(id)), HttpStatus.OK);
    }

    // localhost:8080/costumers POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<SeatDTO> create(@RequestBody SeatDTO seatDTO) {
        return new ResponseEntity<SeatDTO>(seatMapper.toDTO(seatService.insertSeat(seatMapper.fromDTO(seatDTO))), HttpStatus.CREATED);
    }

    //localhost:8080/costumers UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<SeatDTO> update(@PathVariable String id, @RequestBody SeatDTO seatDTO){
        return new ResponseEntity<SeatDTO>(seatMapper.toDTO(seatService.updateSeat(id, seatMapper.fromDTO(seatDTO))), HttpStatus.OK);
    }

    // localhost:8080/costumers/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(seatService.deleteSeat(id), HttpStatus.OK);
    }
}
