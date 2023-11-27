package edu.cesur.fullstack.mappers;

import org.mapstruct.Mapper;

import edu.cesur.fullstack.dtos.AutorDTO;
import edu.cesur.fullstack.persistence.entities.AutorEntity;

@Mapper(componentModel = "spring", uses = {LibroMappers.class})
public interface AutorMappers {
	
	AutorDTO toDto(AutorEntity autor);
	AutorEntity toEntity(AutorDTO autorDTO);
	
}
