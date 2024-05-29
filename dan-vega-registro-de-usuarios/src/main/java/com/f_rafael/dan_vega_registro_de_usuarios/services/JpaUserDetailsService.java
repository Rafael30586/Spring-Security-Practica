package com.f_rafael.dan_vega_registro_de_usuarios.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.f_rafael.dan_vega_registro_de_usuarios.models.SecurityUser;
import com.f_rafael.dan_vega_registro_de_usuarios.repository.UserRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService{
	
	private final UserRepository userRepository;

	@Autowired
    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository
                .findByUsername(username)
                .map(SecurityUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found: " + username));
	}

}
