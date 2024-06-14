package com.f_rafal.valid.entidades;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="personajes")
public class Personaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@NotEmpty
	@NotBlank
	private String nombre; //Otras anotaciones interesantes: @Positive, @Negative, @PositiveOrZero...
	//...@Email
	
	private boolean bueno;
	
	public Personaje(Long id, String nombre, boolean bueno) {
		this.id = id;
		this.nombre = nombre;
		this.bueno = bueno;
	}

	public Personaje() {
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isBueno() {
		return bueno;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setBueno(boolean bueno) {
		this.bueno = bueno;
	}

	@Override
	public String toString() {
		return "Personaje [id=" + id + ", nombre=" + nombre + ", bueno=" + bueno + "]";
	}
	
}
