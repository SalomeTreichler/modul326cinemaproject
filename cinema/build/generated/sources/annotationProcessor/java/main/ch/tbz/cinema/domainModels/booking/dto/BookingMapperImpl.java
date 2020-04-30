package ch.tbz.cinema.domainModels.booking.dto;

import ch.tbz.cinema.domainModels.booking.Booking;
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
public class BookingMapperImpl implements BookingMapper {

    @Override
    public Booking fromDTO(BookingDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Booking booking = new Booking();

        booking.setId( dto.getId() );
        booking.setCostumer( dto.getCostumer() );
        booking.setScreening( dto.getScreening() );
        Set<Seat> set = dto.getSeats();
        if ( set != null ) {
            booking.setSeats( new HashSet<Seat>( set ) );
        }

        return booking;
    }

    @Override
    public List<Booking> fromDTOs(List<BookingDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Booking> list = new ArrayList<Booking>( dtos.size() );
        for ( BookingDTO bookingDTO : dtos ) {
            list.add( fromDTO( bookingDTO ) );
        }

        return list;
    }

    @Override
    public Set<Booking> fromDTOs(Set<BookingDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Booking> set = new HashSet<Booking>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( BookingDTO bookingDTO : dtos ) {
            set.add( fromDTO( bookingDTO ) );
        }

        return set;
    }

    @Override
    public BookingDTO toDTO(Booking dm) {
        if ( dm == null ) {
            return null;
        }

        BookingDTO bookingDTO = new BookingDTO();

        bookingDTO.setId( dm.getId() );
        bookingDTO.setCostumer( dm.getCostumer() );
        bookingDTO.setScreening( dm.getScreening() );
        Set<Seat> set = dm.getSeats();
        if ( set != null ) {
            bookingDTO.setSeats( new HashSet<Seat>( set ) );
        }

        return bookingDTO;
    }

    @Override
    public List<BookingDTO> toDTOs(List<Booking> dms) {
        if ( dms == null ) {
            return null;
        }

        List<BookingDTO> list = new ArrayList<BookingDTO>( dms.size() );
        for ( Booking booking : dms ) {
            list.add( toDTO( booking ) );
        }

        return list;
    }

    @Override
    public Set<BookingDTO> toDTOs(Set<Booking> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<BookingDTO> set = new HashSet<BookingDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Booking booking : dms ) {
            set.add( toDTO( booking ) );
        }

        return set;
    }
}
