package com.f_rafal.valid.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f_rafal.valid.entidades.Personaje;

@Repository
public interface PersonajeRepositorio extends JpaRepository<Personaje,Long>{

}
