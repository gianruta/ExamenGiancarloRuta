package edu.cesur.fullstack.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.fullstack.dtos.AutorDTO;
import edu.cesur.fullstack.services.AutorService;

@RestController
@RequestMapping("/autor")
public class AutorRestController {
	
	@Autowired
	AutorService autorService;
	
	
	@PostMapping
	ResponseEntity<?> createAutor(@RequestBody AutorDTO autorDTO) {

		AutorDTO autor = autorService.createAutor(autorDTO);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + autor.getId())
				.buildAndExpand(autor.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@GetMapping("/{id}")
	ResponseEntity<?> getAutorById(@PathVariable Long id) {

		return ResponseEntity.ok(autorService.getAutorById(id));
	}

}
