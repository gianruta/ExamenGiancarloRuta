package edu.cesur.fullstack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.dtos.LibroDTO;
import edu.cesur.fullstack.mappers.LibroMappers;
import edu.cesur.fullstack.persistence.entities.AutorEntity;
import edu.cesur.fullstack.persistence.entities.LibroEntity;
import edu.cesur.fullstack.persistence.repositories.AutorRepository;
import edu.cesur.fullstack.persistence.repositories.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{
	
	@Autowired
	LibroRepository libroRepository;
	@Autowired
	LibroMappers libroMappers;
	@Autowired
	AutorRepository autorRepository;
	
	@Override
	public LibroDTO createLibro(LibroDTO libroDTO) {
		Long autorId = libroDTO.getAutorId();
	    if (!autorRepository.existsById(autorId)) {
	        throw new RuntimeException("El autor con ID " + autorId + " no existe en la base de datos");
	    }
		
		LibroEntity libroEntity = libroRepository.save(libroMappers.toEntity(libroDTO));
		return libroMappers.toDto(libroEntity);
	}

	@Override
	public LibroDTO getLibroById(Long id) {
		LibroEntity libroEntity = libroRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Libro no encontrado"));
		
		return libroMappers.toDto(libroEntity);
	}

}
