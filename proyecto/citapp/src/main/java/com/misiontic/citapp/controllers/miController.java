package com.misiontic.citapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class miController {
	
	@GetMapping(value="/bienvenida")
	public String bienvenida() {
		return "Hola, te doy la bienvenida a este sitio web. ;)";
	}

}
