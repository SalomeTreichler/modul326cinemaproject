package ch.tbz.cinema.domainModels.costumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/costumers")
public class CostumerController {

    private CostumerService costumerService;

    @Autowired
    public CostumerController(CostumerService costumerService){
        this.costumerService = costumerService;
    }

    // localhost:8080/costumers  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<Costumer>> getAll() {
        return new ResponseEntity<List<Costumer>>(costumerService.getAllCostumers(), HttpStatus.OK);
    }

    // localhost:8080/costumers/desc  GET
    @GetMapping("/desc")
    public @ResponseBody
    ResponseEntity<List<Costumer>> getProductsSortByDesc() {
        return new ResponseEntity<List<Costumer>>(costumerService.sortListByNameDesc(), HttpStatus.OK);
    }

    // localhost:8080/costumers/asc  GET
    @GetMapping("/asc")
    public @ResponseBody
    ResponseEntity<List<Costumer>> getProductsSortByAsc() {
        return new ResponseEntity<List<Costumer>>(costumerService.sortListByNameAsc(), HttpStatus.OK);
    }

    // localhost:8080/costumers/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Costumer> getById(@PathVariable String id) {
        return new ResponseEntity<Costumer>(costumerService.getCostumerById(id), HttpStatus.OK);
    }

    // localhost:8080/costumers POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<Costumer> create(@RequestBody Costumer costumer) {
        return new ResponseEntity<Costumer>(costumerService.insertCostumer(costumer), HttpStatus.CREATED);
    }

    // localhost:8080/costumers/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(costumerService.deleteCostumer(id), HttpStatus.OK);
    }

    //localhost:8080/costumers UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Costumer> update(@PathVariable String id, @RequestBody Costumer product){
        return new ResponseEntity<Costumer>(costumerService.updateCostumer(id, product), HttpStatus.OK);
    }
}
