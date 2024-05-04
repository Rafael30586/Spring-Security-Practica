package com.frafael.springsecuritylogin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ConfiguracionWebSeguridad {
	
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder()
				.username("rafael")
				.password("123456")
				.roles("USER").build());
		manager.createUser(User.withDefaultPasswordEncoder()
				.username("marianela")
				.password("908")
				.roles("USER").build());
		manager.createUser(User.withDefaultPasswordEncoder()
				.username("david")
				.password("512")
				.roles("USER").build());
		return manager;
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests(authorize -> 
		authorize
		.anyRequest().authenticated())
		.formLogin(form -> form
				.loginPage("/login")
				.defaultSuccessUrl("/saludo",true)
				.permitAll())
		.logout(logout->logout.logoutUrl("/logout")
				.logoutSuccessUrl("/salida")
				.permitAll())
				.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
	
	@Bean
	public WebSecurityCustomizer customizador() {
		return (web)-> web.ignoring().requestMatchers("/css/**");
	}

}
