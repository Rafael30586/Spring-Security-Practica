package com.f_rafael.dan_vega_registro_de_usuarios.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f_rafael.dan_vega_registro_de_usuarios.models.User;
import com.f_rafael.dan_vega_registro_de_usuarios.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

}
