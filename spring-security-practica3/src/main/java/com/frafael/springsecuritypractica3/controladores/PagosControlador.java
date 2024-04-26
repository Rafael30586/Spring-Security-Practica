package com.frafael.springsecuritypractica3.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagos")
public class PagosControlador {
	
	@GetMapping("/lista")
	public List<String> mostrarUsuarios(){
		List<String> pagos =List.of("Pago34910","Pago50294","Pago40012");
		
		return pagos;
	}

}
