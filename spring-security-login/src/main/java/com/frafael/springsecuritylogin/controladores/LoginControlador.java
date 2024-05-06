package com.frafael.springsecuritylogin.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class LoginControlador {
	
	@GetMapping("/login")
	public ModelAndView login() {
		
		ModelAndView pagina = new ModelAndView();
		pagina.setViewName("login.html");		
		return pagina;
	}
	
	@GetMapping("/saludo")
	public String saludar() {
		return "<h1 style=\"color: #770f00\">Hola Mundo</h1>";
	}
	
	@GetMapping("/salida")
	public String saliste() {
		return "<h2 style=\"color: #9b07e8\">Saliste</h2>";
	}
}
