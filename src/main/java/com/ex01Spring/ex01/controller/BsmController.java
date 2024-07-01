package com.ex01Spring.ex01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("BSM-Controller")
public class BsmController {
	@GetMapping
	public String bsm(){
		
		return"Mentalidades:\r\n"
				+ "de crescimento\r\n"
				+ "⁠responsabilidade pessoal\r\n"
				+ "⁠orientação ao futuro\r\n"
				+ "⁠persistência \r\n"
				+ "\r\n"
				+ "Competências comportamentais:\r\n"
				+ "Comunicação\r\n"
				+ "Proatividade\r\n"
				+"Orientação ao detalhe\r\n"
				+"Trabalho em equipe\r\n";
	}
	

}
