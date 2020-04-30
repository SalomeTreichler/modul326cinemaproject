package ch.tbz.cinema.domainModels.seat.dto;

import ch.tbz.cinema.domainModels.seat.Seat;
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
public class SeatMapperImpl implements SeatMapper {

    @Override
    public Seat fromDTO(SeatDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Seat seat = new Seat();

        seat.setId( dto.getId() );
        seat.setSeatNumber( dto.getSeatNumber() );
        seat.setRowNumber( dto.getRowNumber() );
        seat.setBooked( dto.isBooked() );

        return seat;
    }

    @Override
    public List<Seat> fromDTOs(List<SeatDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Seat> list = new ArrayList<Seat>( dtos.size() );
        for ( SeatDTO seatDTO : dtos ) {
            list.add( fromDTO( seatDTO ) );
        }

        return list;
    }

    @Override
    public Set<Seat> fromDTOs(Set<SeatDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Seat> set = new HashSet<Seat>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( SeatDTO seatDTO : dtos ) {
            set.add( fromDTO( seatDTO ) );
        }

        return set;
    }

    @Override
    public SeatDTO toDTO(Seat dm) {
        if ( dm == null ) {
            return null;
        }

        SeatDTO seatDTO = new SeatDTO();

        seatDTO.setSeatNumber( dm.getSeatNumber() );
        seatDTO.setRowNumber( dm.getRowNumber() );
        seatDTO.setBooked( dm.isBooked() );
        seatDTO.setId( dm.getId() );

        return seatDTO;
    }

    @Override
    public List<SeatDTO> toDTOs(List<Seat> dms) {
        if ( dms == null ) {
            return null;
        }

        List<SeatDTO> list = new ArrayList<SeatDTO>( dms.size() );
        for ( Seat seat : dms ) {
            list.add( toDTO( seat ) );
        }

        return list;
    }

    @Override
    public Set<SeatDTO> toDTOs(Set<Seat> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<SeatDTO> set = new HashSet<SeatDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Seat seat : dms ) {
            set.add( toDTO( seat ) );
        }

        return set;
    }
}
