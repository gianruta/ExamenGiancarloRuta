package edu.cesur.fullstack.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorDTO {
	
	private Long id;
	private String nombre;
	private String nacionalidad;
	private List<LibroDTO> libros = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public List<LibroDTO> getLibros() {
		return libros;
	}
	public void setLibros(List<LibroDTO> libros) {
		this.libros = libros;
	}
	
	
}
