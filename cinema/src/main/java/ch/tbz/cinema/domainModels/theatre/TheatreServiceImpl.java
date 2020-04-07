package ch.tbz.cinema.domainModels.theatre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService {

  private TheatreRepository theatreRepository;

  @Autowired
  public TheatreServiceImpl(TheatreRepository theatreRepository) {
    this.theatreRepository = theatreRepository;
  }

  @Override
  public List<Theatre> sortListByNameAsc() {
    List<Theatre> theatreList = theatreRepository.findAll();
    theatreList.sort(Comparator.comparing(Theatre::getName));
    return theatreList;
  }

  @Override
  public List<Theatre> sortListByNameDesc() {
    List<Theatre> theatreList = theatreRepository.findAll();
    theatreList.sort(Comparator.comparing(Theatre::getName).reversed());
    return theatreList;
  }

  @Override
  public List<Theatre> getAllTheatres() {
    return theatreRepository.findAll();
  }

  @Override
  public Theatre getTheatreById(String id) {
    return theatreRepository.findById(id).orElse(null);
  }

  @Override
  public Theatre insertTheatre(Theatre newTheatre) {
    return theatreRepository.save(newTheatre);
  }

  @Override
  public Theatre updateTheatre(String id, Theatre newTheatre) {
    return theatreRepository.save(newTheatre);
  }

  @Override
  public String deleteTheatreById(String id) {
    theatreRepository.deleteById(id);
    return "The Theatre has been deleted successfully";
  }
}
