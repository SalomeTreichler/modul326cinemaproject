package ch.tbz.cinema.domainModels.movie.dto;

import ch.tbz.cinema.domainModels.movie.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Set;

@Mapper(componentModel="spring", unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface MovieMapper {

  Movie fromDTO(MovieDTO dto);

  List<Movie> fromDTOs(List<MovieDTO> dtos);

  Set<Movie> fromDTOs(Set<MovieDTO> dtos);

  MovieDTO toDTO(Movie dm);

  List<MovieDTO> toDTOs(List<Movie> dms);

  Set<MovieDTO> toDTOs(Set<Movie> dms);
}
