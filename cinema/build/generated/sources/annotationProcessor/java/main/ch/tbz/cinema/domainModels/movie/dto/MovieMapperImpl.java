package ch.tbz.cinema.domainModels.movie.dto;

import ch.tbz.cinema.domainModels.movie.Movie;
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
public class MovieMapperImpl implements MovieMapper {

    @Override
    public Movie fromDTO(MovieDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Movie movie = new Movie();

        movie.setId( dto.getId() );
        movie.setTitle( dto.getTitle() );
        movie.setDirector( dto.getDirector() );
        movie.setDuration( dto.getDuration() );

        return movie;
    }

    @Override
    public List<Movie> fromDTOs(List<MovieDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Movie> list = new ArrayList<Movie>( dtos.size() );
        for ( MovieDTO movieDTO : dtos ) {
            list.add( fromDTO( movieDTO ) );
        }

        return list;
    }

    @Override
    public Set<Movie> fromDTOs(Set<MovieDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Movie> set = new HashSet<Movie>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( MovieDTO movieDTO : dtos ) {
            set.add( fromDTO( movieDTO ) );
        }

        return set;
    }

    @Override
    public MovieDTO toDTO(Movie dm) {
        if ( dm == null ) {
            return null;
        }

        MovieDTO movieDTO = new MovieDTO();

        movieDTO.setId( dm.getId() );
        movieDTO.setTitle( dm.getTitle() );
        movieDTO.setDirector( dm.getDirector() );
        movieDTO.setDuration( dm.getDuration() );

        return movieDTO;
    }

    @Override
    public List<MovieDTO> toDTOs(List<Movie> dms) {
        if ( dms == null ) {
            return null;
        }

        List<MovieDTO> list = new ArrayList<MovieDTO>( dms.size() );
        for ( Movie movie : dms ) {
            list.add( toDTO( movie ) );
        }

        return list;
    }

    @Override
    public Set<MovieDTO> toDTOs(Set<Movie> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<MovieDTO> set = new HashSet<MovieDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Movie movie : dms ) {
            set.add( toDTO( movie ) );
        }

        return set;
    }
}
