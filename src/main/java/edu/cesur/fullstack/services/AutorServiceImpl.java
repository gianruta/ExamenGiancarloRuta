package edu.cesur.fullstack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.dtos.AutorDTO;
import edu.cesur.fullstack.mappers.AutorMappers;
import edu.cesur.fullstack.persistence.entities.AutorEntity;
import edu.cesur.fullstack.persistence.repositories.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	public AutorRepository autorRepository;
	@Autowired
	public AutorMappers autorMappers;
	
	@Override
	public AutorDTO createAutor(AutorDTO autorDTO) {
		
		return autorMappers.toDto(autorRepository.save(autorMappers.toEntity(autorDTO)));
	}

	@Override
	public AutorDTO getAutorById(Long id) {
		
		AutorEntity autorEntity = autorRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Autor no encontrado"));
		
		return autorMappers.toDto(autorEntity);
	}

	@Override
	public List<AutorEntity> obtenerAutoresConLibros() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
