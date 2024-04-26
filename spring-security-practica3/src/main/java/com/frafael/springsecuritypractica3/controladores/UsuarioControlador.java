package com.frafael.springsecuritypractica3.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {
	
	@GetMapping("/lista")
	public List<String> mostrarUsuarios(){
		List<String> usuarios =List.of("Armando","Alejandra","Horacio","Noelia");
		
		return usuarios;
	}

}
