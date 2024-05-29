package com.f_rafael.dan_vega_registro_de_usuarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.f_rafael.dan_vega_registro_de_usuarios.models.User;
import com.f_rafael.dan_vega_registro_de_usuarios.services.UserService;

@RestController
public class HomeController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserService userService;
	
	@GetMapping
    public String home() {
        return "Hello, World!";
    }

    //@PreAuthorize("hasRole('User')")
    @GetMapping("/user")
    public String user() {
        return "Hello, User!";
    }

    //@PreAuthorize("hasRole('Admin')")
    @GetMapping("/admin")
    public String admin() {
        return "Hello, Admin!";
    }
    
    @PostMapping("/user")
    public void saveUser(@RequestParam String name,
    		@RequestParam String password,@RequestParam String roles) {
    	User user = new User();
    	user.setUsername(name);
    	user.setPassword(passwordEncoder.encode(password));
    	user.setRoles(roles);
    	
    	userService.saveUser(user);
    }

}
