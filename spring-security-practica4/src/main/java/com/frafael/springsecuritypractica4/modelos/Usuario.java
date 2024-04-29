package com.frafael.springsecuritypractica4.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Usuario {
	
	private Long Dni;
	private String nombre;
	private int edad;
	
	@Enumerated(EnumType.STRING)
	private Rol rol;
	
	public Usuario(Long dni, String nombre, int edad, Rol rol) {
		Dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.rol = rol;
	}

	public Usuario() {
	}

	public Long getDni() {
		return Dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setDni(Long dni) {
		Dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario [Dni=" + Dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
