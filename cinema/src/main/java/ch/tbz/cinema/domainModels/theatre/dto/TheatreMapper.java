package ch.tbz.cinema.domainModels.theatre.dto;

import ch.tbz.cinema.domainModels.theatre.Theatre;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Set;

@Mapper(componentModel="spring", unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface TheatreMapper {

  Theatre fromDTO(TheatreDTO dto);

  List<Theatre> fromDTOs(List<TheatreDTO> dtos);

  Set<Theatre> fromDTOs(Set<TheatreDTO> dtos);

  TheatreDTO toDTO(Theatre dm);

  List<TheatreDTO> toDTOs(List<Theatre> dms);

  Set<TheatreDTO> toDTOs(Set<Theatre> dms);
}
