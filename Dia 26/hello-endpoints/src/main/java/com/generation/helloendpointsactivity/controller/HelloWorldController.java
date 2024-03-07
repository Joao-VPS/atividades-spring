package com.generation.helloendpointsactivity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello, World!";
	}
	
	@GetMapping("/bsm-list")
	public String bsmList() {
		return "Lista de SBMs:\n"
				+ "1 - Mentalidade de Crescimento\n"
				+ "2 - Demonstrando Orientação ao Detalhe\n"
				+ "3 - Proatividade - Atividade de Representação\n"
				+ "4 - Estudo de Caso - Ética na Indústria de Desenvolvimento Web";
	}
	
	@GetMapping("/objectives")
	public String objectives() {
		return "Pretendo aprender mais sobre as ferramentas Spring e Imsomnia para desenvolver aplicativos web.";
	}
}
