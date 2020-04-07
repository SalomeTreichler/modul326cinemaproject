package ch.tbz.cinema.domainModels.costumer.dto;

import ch.tbz.cinema.domainModels.costumer.Costumer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Set;

@Mapper(componentModel="spring", unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface CostumerMapper {
    Costumer fromDTO(CostumerDTO dto);

    List<Costumer> fromDTOs(List<CostumerDTO> dtos);

    Set<Costumer> fromDTOs(Set<CostumerDTO> dtos);

    CostumerDTO toDTO(Costumer dm);

    List<CostumerDTO> toDTOs(List<Costumer> dms);

    Set<CostumerDTO> toDTOs(Set<Costumer> dms);
}
