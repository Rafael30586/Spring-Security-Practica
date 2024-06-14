package com.f_rafael.prueba_fetch.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Seguridad {
	
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.headers(head->head
				.contentSecurityPolicy("default-src 'self'; connect-src 'self' http://localhost:8080")
				.and()
				.frameOptions().sameOrigin());
		
		return http.build();
	}

}
