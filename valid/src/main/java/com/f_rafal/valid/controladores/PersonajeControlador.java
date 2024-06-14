package com.f_rafal.valid.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.f_rafal.valid.entidades.Personaje;
import com.f_rafal.valid.servicios.PersonajeServicio;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeControlador {
	
	@Autowired
	private PersonajeServicio personajeServicio;
	
	@GetMapping("/saludo")
	public String saludar() {
		return "Hola mundo";
	}
	
	@PostMapping("/guardado")
	public void guardarPersonaje(@Valid @RequestBody Personaje personaje) {
		personajeServicio.guardarPersonaje(personaje);
	}
	
	@GetMapping("/todos")
	public List<Personaje> mostrarPersonajes(){
		return personajeServicio.retornarPersonajes();
	}

}
