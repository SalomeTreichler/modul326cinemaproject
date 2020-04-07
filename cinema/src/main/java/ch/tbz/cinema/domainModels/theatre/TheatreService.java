package ch.tbz.cinema.domainModels.theatre;

import java.util.List;

public interface TheatreService {

  public List<Theatre> sortListByNameAsc();

  public List<Theatre> sortListByNameDesc();

  public List<Theatre> getAllTheatres();

  public Theatre getTheatreById(String id);

  Theatre insertTheatre (Theatre newTheatre);

  Theatre updateTheatre (String id, Theatre newMovie);

  String deleteTheatreById (String id);
}
