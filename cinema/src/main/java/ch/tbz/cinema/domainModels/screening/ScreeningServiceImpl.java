package ch.tbz.cinema.domainModels.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ScreeningServiceImpl implements ScreeningService{

    @Autowired
    private ScreeningRepository screeningRepository;

    @Override
    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }

    @Override
    public Screening getScreeningById(String id) {
        return screeningRepository.findById(id).get();
    }

    @Override
    public Screening insertScreening(Screening screening) {
        screeningRepository.save(screening);
        return screening;
    }

    @Override
    public String deleteScreening(String id) {
        screeningRepository.deleteById(id);
        return "Screening has been deleted";
    }

    @Override
    public Screening updateScreening(String id, Screening screening) {
        if(screeningRepository.existsById(id)) {
            screening.setId(id);
            screeningRepository.save(screening);

            return screening;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }
}
