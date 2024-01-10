package com.generation.olamundo.controller;

import java.util.ArrayList;

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
	@GetMapping("/bsm")
	public ArrayList ListaBSM() {
		ArrayList<String> bsm = new ArrayList<String>();
		bsm.add("comunicação");
		bsm.add("proatividade");
		bsm.add("orientação ao detalhe");
		bsm.add("trabalho em equipe");
		bsm.add("mentalidade de crescimento");
		bsm.add("orientação ao futuro");
		bsm.add("responsabilidade pessoal");
		bsm.add("persistência");

		return bsm;
	}

}
