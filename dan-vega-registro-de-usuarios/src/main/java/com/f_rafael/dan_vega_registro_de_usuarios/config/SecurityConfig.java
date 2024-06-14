package com.f_rafael.dan_vega_registro_de_usuarios.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.f_rafael.dan_vega_registro_de_usuarios.services.JpaUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	private JpaUserDetailsService myUserDetailsService;//rafael 1234 Admin, cristian 1234 USER
	
	@Autowired
	public SecurityConfig(JpaUserDetailsService myUserDetailsService) {
        this.myUserDetailsService = myUserDetailsService;
    }
	
	@Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
        		.csrf(csrf->csrf.disable())
        		.authorizeHttpRequests(request->request
        				.requestMatchers("/admin").hasRole("Admin")
        				.requestMatchers("/user").permitAll()
        				.requestMatchers("/").permitAll())
        		.userDetailsService(myUserDetailsService)
        		.formLogin(login->login.permitAll())
        		.headers(headers -> headers.frameOptions().sameOrigin())
        		.httpBasic(Customizer.withDefaults())
        		.build();          
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
