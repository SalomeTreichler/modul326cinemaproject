package ch.tbz.cinema.domainModels.screening.dto;

import ch.tbz.cinema.domainModels.screening.Screening;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-30T14:29:24+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
@Component
public class ScreeningMapperImpl implements ScreeningMapper {

    @Override
    public Screening fromDTO(ScreeningDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Screening screening = new Screening();

        screening.setId( dto.getId() );
        screening.setMovie( dto.getMovie() );
        screening.setTheatre( dto.getTheatre() );
        screening.setDateAndTime( dto.getDateAndTime() );

        return screening;
    }

    @Override
    public List<Screening> fromDTOs(List<ScreeningDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Screening> list = new ArrayList<Screening>( dtos.size() );
        for ( ScreeningDTO screeningDTO : dtos ) {
            list.add( fromDTO( screeningDTO ) );
        }

        return list;
    }

    @Override
    public Set<Screening> fromDTOs(Set<ScreeningDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Screening> set = new HashSet<Screening>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( ScreeningDTO screeningDTO : dtos ) {
            set.add( fromDTO( screeningDTO ) );
        }

        return set;
    }

    @Override
    public ScreeningDTO toDTO(Screening dm) {
        if ( dm == null ) {
            return null;
        }

        ScreeningDTO screeningDTO = new ScreeningDTO();

        screeningDTO.setId( dm.getId() );
        screeningDTO.setMovie( dm.getMovie() );
        screeningDTO.setTheatre( dm.getTheatre() );
        screeningDTO.setDateAndTime( dm.getDateAndTime() );

        return screeningDTO;
    }

    @Override
    public List<ScreeningDTO> toDTOs(List<Screening> dms) {
        if ( dms == null ) {
            return null;
        }

        List<ScreeningDTO> list = new ArrayList<ScreeningDTO>( dms.size() );
        for ( Screening screening : dms ) {
            list.add( toDTO( screening ) );
        }

        return list;
    }

    @Override
    public Set<ScreeningDTO> toDTOs(Set<Screening> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<ScreeningDTO> set = new HashSet<ScreeningDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Screening screening : dms ) {
            set.add( toDTO( screening ) );
        }

        return set;
    }
}
