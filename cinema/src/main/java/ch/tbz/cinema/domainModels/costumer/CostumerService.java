package ch.tbz.cinema.domainModels.costumer;

import java.util.List;

public interface CostumerService {
    //sorts a list of costumers ascending by name
    public List<Costumer> sortListByNameAsc ();

    //sorts a list of costumers descending by name
    public List<Costumer> sortListByNameDesc ();

    //returns all costumers
    public List<Costumer> getAllCostumers();

    //returns a costumer by id
    public Costumer getCostumerById(String id);

    //inserts new costumer
    public Costumer insertCostumer(Costumer Costumer);

    //deletes a costumer by id
    public String deleteCostumer(String id);

    //update a costumer by id
    public Costumer updateCostumer(String id, Costumer Costumer);
}
