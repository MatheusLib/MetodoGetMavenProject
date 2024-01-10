package com.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Olamundo")
public class OlaMundoController {
	@GetMapping
	public String OlaMundo() {
		return "Ola Mundo na familia 71";
	}

}
