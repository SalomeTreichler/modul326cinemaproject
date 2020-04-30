package ch.tbz.cinema.domainModels.costumer;

import ch.tbz.cinema.domainModels.costumer.dto.CostumerDTO;
import ch.tbz.cinema.domainModels.costumer.dto.CostumerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/costumers")
public class CostumerController {

    private CostumerService costumerService;
    private CostumerMapper costumerMapper;

    @Autowired
    public CostumerController(CostumerService costumerService, CostumerMapper costumerMapper){
        this.costumerMapper = costumerMapper;
        this.costumerService = costumerService;
    }

    // localhost:8080/costumers  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<CostumerDTO>> getAll() {
        return new ResponseEntity<>(costumerMapper.toDTOs(costumerService.getAllCostumers()), HttpStatus.OK);
    }

    // localhost:8080/costumers/desc  GET
    @GetMapping("/desc")
    public @ResponseBody
    ResponseEntity<List<CostumerDTO>> getCustomersSortByDesc() {
        return new ResponseEntity<>(costumerMapper.toDTOs(costumerService.sortListByNameDesc()), HttpStatus.OK);
    }

    // localhost:8080/costumers/asc  GET
    @GetMapping("/asc")
    public @ResponseBody
    ResponseEntity<List<CostumerDTO>> getCustomersSortByAsc() {
        return new ResponseEntity<>(costumerMapper.toDTOs(costumerService.sortListByNameAsc()), HttpStatus.OK);
    }

    // localhost:8080/costumers/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<CostumerDTO> getById(@PathVariable String id) {
        return new ResponseEntity<CostumerDTO>(costumerMapper.toDTO(costumerService.getCostumerById(id)), HttpStatus.OK);
    }

    // localhost:8080/costumers POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<CostumerDTO> create(@RequestBody CostumerDTO costumerDTO) {
        return new ResponseEntity<CostumerDTO>(costumerMapper.toDTO(costumerService.insertCostumer(costumerMapper.fromDTO(costumerDTO))), HttpStatus.CREATED);
    }

    //localhost:8080/costumers UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<CostumerDTO> update(@PathVariable String id, @RequestBody CostumerDTO costumerDTO){
        return new ResponseEntity<CostumerDTO>(costumerMapper.toDTO(costumerService.updateCostumer(id, costumerMapper.fromDTO(costumerDTO))), HttpStatus.OK);
    }

    // localhost:8080/costumers/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(costumerService.deleteCostumer(id), HttpStatus.OK);
    }
}
