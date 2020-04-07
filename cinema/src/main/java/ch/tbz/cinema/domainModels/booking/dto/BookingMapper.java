package ch.tbz.cinema.domainModels.booking.dto;

import ch.tbz.cinema.domainModels.booking.Booking;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Set;

@Mapper(componentModel="spring", unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface BookingMapper {

  Booking fromDTO(BookingDTO dto);

  List<Booking> fromDTOs(List<BookingDTO> dtos);

  Set<Booking> fromDTOs(Set<BookingDTO> dtos);

  BookingDTO toDTO(Booking dm);

  List<BookingDTO> toDTOs(List<Booking> dms);

  Set<BookingDTO> toDTOs(Set<Booking> dms);
}
