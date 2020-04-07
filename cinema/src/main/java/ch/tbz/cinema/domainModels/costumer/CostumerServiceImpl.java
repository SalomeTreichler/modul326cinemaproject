package ch.tbz.cinema.domainModels.costumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CostumerServiceImpl implements CostumerService{
    @Autowired
    private CostumerRepository costumerRepository;

    @Override
    public List<Costumer> sortListByNameAsc() {
        List<Costumer> costumerList = costumerRepository.findAll();
        costumerList.sort(Comparator.comparing(Costumer::getName));

        return costumerList;
    }

    @Override
    public List<Costumer> sortListByNameDesc() {
        List<Costumer> costumerList = costumerRepository.findAll();
        costumerList.sort(Comparator.comparing(Costumer::getName).reversed());

        return costumerList;
    }

    @Override
    public List<Costumer> getAllCostumers() {
        return costumerRepository.findAll();
    }

    @Override
    public Costumer getCostumerById(String id) {
        return costumerRepository.findById(id).orElse(null);
    }

    @Override
    public Costumer insertCostumer(Costumer costumer) {
        costumerRepository.save(costumer);
        return costumer;
    }

    @Override
    public String deleteCostumer(String id) {
        costumerRepository.deleteById(id);
        return "Costumer has been deleted";
    }

    @Override
    public Costumer updateCostumer(String id, Costumer costumer) {
        if(costumerRepository.existsById(id)) {
            costumer.setId(id);
            costumerRepository.save(costumer);

            return costumer;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }
}
