package com.f_rafal.valid.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f_rafal.valid.entidades.Personaje;
import com.f_rafal.valid.repositorios.PersonajeRepositorio;

@Service
public class PersonajeServicio {
	
	@Autowired
	private PersonajeRepositorio personajeRepositorio;
	
	public void guardarPersonaje(Personaje personaje) {
		personajeRepositorio.save(personaje);
	}
	
	public List<Personaje> retornarPersonajes(){
		return personajeRepositorio.findAll();
	}

}
