package ch.tbz.cinema.domainModels.screening;

import java.util.List;

public interface ScreeningService {
    //returns all Screenings
    public List<Screening> getAllScreenings();

    //returns a Screening by id
    public Screening getScreeningById(String id);

    //inserts new Screening
    public Screening insertScreening(Screening screening);

    //deletes a Screening by id
    public String deleteScreening(String id);

    //update a Screening by id
    public Screening updateScreening(String id, Screening screening);
}
