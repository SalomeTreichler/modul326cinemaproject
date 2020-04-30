package ch.tbz.cinema.domainModels.theatre.dto;

import ch.tbz.cinema.domainModels.seat.Seat;
import ch.tbz.cinema.domainModels.theatre.Theatre;
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
public class TheatreMapperImpl implements TheatreMapper {

    @Override
    public Theatre fromDTO(TheatreDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Theatre theatre = new Theatre();

        theatre.setId( dto.getId() );
        theatre.setName( dto.getName() );
        Set<Seat> set = dto.getSeats();
        if ( set != null ) {
            theatre.setSeats( new HashSet<Seat>( set ) );
        }

        return theatre;
    }

    @Override
    public List<Theatre> fromDTOs(List<TheatreDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Theatre> list = new ArrayList<Theatre>( dtos.size() );
        for ( TheatreDTO theatreDTO : dtos ) {
            list.add( fromDTO( theatreDTO ) );
        }

        return list;
    }

    @Override
    public Set<Theatre> fromDTOs(Set<TheatreDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Theatre> set = new HashSet<Theatre>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( TheatreDTO theatreDTO : dtos ) {
            set.add( fromDTO( theatreDTO ) );
        }

        return set;
    }

    @Override
    public TheatreDTO toDTO(Theatre dm) {
        if ( dm == null ) {
            return null;
        }

        TheatreDTO theatreDTO = new TheatreDTO();

        theatreDTO.setId( dm.getId() );
        theatreDTO.setName( dm.getName() );
        Set<Seat> set = dm.getSeats();
        if ( set != null ) {
            theatreDTO.setSeats( new HashSet<Seat>( set ) );
        }

        return theatreDTO;
    }

    @Override
    public List<TheatreDTO> toDTOs(List<Theatre> dms) {
        if ( dms == null ) {
            return null;
        }

        List<TheatreDTO> list = new ArrayList<TheatreDTO>( dms.size() );
        for ( Theatre theatre : dms ) {
            list.add( toDTO( theatre ) );
        }

        return list;
    }

    @Override
    public Set<TheatreDTO> toDTOs(Set<Theatre> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<TheatreDTO> set = new HashSet<TheatreDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Theatre theatre : dms ) {
            set.add( toDTO( theatre ) );
        }

        return set;
    }
}
