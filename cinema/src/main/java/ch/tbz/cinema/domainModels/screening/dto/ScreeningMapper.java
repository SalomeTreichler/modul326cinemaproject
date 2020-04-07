package ch.tbz.cinema.domainModels.screening.dto;

import ch.tbz.cinema.domainModels.screening.Screening;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Set;

@Mapper(componentModel="spring", unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface ScreeningMapper {
    Screening fromDTO(ScreeningDTO dto);

    List<Screening> fromDTOs(List<ScreeningDTO> dtos);

    Set<Screening> fromDTOs(Set<ScreeningDTO> dtos);

    ScreeningDTO toDTO(Screening dm);

    List<ScreeningDTO> toDTOs(List<Screening> dms);

    Set<ScreeningDTO> toDTOs(Set<Screening> dms);
}
