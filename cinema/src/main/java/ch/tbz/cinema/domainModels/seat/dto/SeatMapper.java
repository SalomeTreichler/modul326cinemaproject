package ch.tbz.cinema.domainModels.seat.dto;

import ch.tbz.cinema.domainModels.seat.Seat;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Set;

@Mapper(componentModel="spring", unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface SeatMapper {
    Seat fromDTO(SeatDTO dto);

    List<Seat> fromDTOs(List<SeatDTO> dtos);

    Set<Seat> fromDTOs(Set<SeatDTO> dtos);

    SeatDTO toDTO(Seat dm);

    List<SeatDTO> toDTOs(List<Seat> dms);

    Set<SeatDTO> toDTOs(Set<Seat> dms);
}
