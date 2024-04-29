package com.frafael.springsecuritypractica4.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private boolean esBueno;
	
	public Personaje(Long id, String nombre, boolean esBueno) {
		this.id = id;
		this.nombre = nombre;
		this.esBueno = esBueno;
	}

	public Personaje() {
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isEsBueno() {
		return esBueno;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEsBueno(boolean esBueno) {
		this.esBueno = esBueno;
	}

	@Override
	public String toString() {
		return "Personaje [id=" + id + ", nombre=" + nombre + ", esBueno=" + esBueno + "]";
	}
	
}
