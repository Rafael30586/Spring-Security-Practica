package com.frafael.springsecuritypractica4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frafael.springsecuritypractica4.modelos.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Long>{

}
