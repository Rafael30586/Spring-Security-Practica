package com.f_rafael.dan_vega_registro_de_usuarios.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.f_rafael.dan_vega_registro_de_usuarios.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	
	Optional<User> findByUsername(String username);

}
