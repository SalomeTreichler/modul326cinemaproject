package ch.tbz.cinema.domainModels.costumer.dto;

import ch.tbz.cinema.domainModels.costumer.Costumer;
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
public class CostumerMapperImpl implements CostumerMapper {

    @Override
    public Costumer fromDTO(CostumerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Costumer costumer = new Costumer();

        costumer.setId( dto.getId() );
        costumer.setName( dto.getName() );
        costumer.setFirstName( dto.getFirstName() );
        costumer.setPhoneNumber( dto.getPhoneNumber() );

        return costumer;
    }

    @Override
    public List<Costumer> fromDTOs(List<CostumerDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Costumer> list = new ArrayList<Costumer>( dtos.size() );
        for ( CostumerDTO costumerDTO : dtos ) {
            list.add( fromDTO( costumerDTO ) );
        }

        return list;
    }

    @Override
    public Set<Costumer> fromDTOs(Set<CostumerDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Costumer> set = new HashSet<Costumer>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( CostumerDTO costumerDTO : dtos ) {
            set.add( fromDTO( costumerDTO ) );
        }

        return set;
    }

    @Override
    public CostumerDTO toDTO(Costumer dm) {
        if ( dm == null ) {
            return null;
        }

        CostumerDTO costumerDTO = new CostumerDTO();

        costumerDTO.setName( dm.getName() );
        costumerDTO.setFirstName( dm.getFirstName() );
        costumerDTO.setPhoneNumber( dm.getPhoneNumber() );
        costumerDTO.setId( dm.getId() );

        return costumerDTO;
    }

    @Override
    public List<CostumerDTO> toDTOs(List<Costumer> dms) {
        if ( dms == null ) {
            return null;
        }

        List<CostumerDTO> list = new ArrayList<CostumerDTO>( dms.size() );
        for ( Costumer costumer : dms ) {
            list.add( toDTO( costumer ) );
        }

        return list;
    }

    @Override
    public Set<CostumerDTO> toDTOs(Set<Costumer> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<CostumerDTO> set = new HashSet<CostumerDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Costumer costumer : dms ) {
            set.add( toDTO( costumer ) );
        }

        return set;
    }
}
