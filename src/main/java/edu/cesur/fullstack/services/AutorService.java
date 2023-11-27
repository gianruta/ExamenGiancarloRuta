package edu.cesur.fullstack.services;

import java.util.List;

import edu.cesur.fullstack.dtos.AutorDTO;
import edu.cesur.fullstack.dtos.LibroDTO;
import edu.cesur.fullstack.persistence.entities.AutorEntity;

public interface AutorService {
	
	AutorDTO createAutor(AutorDTO autorDTO);
	
	AutorDTO getAutorById(Long id);
	
	public List<AutorEntity> obtenerAutoresConLibros();
	
}
