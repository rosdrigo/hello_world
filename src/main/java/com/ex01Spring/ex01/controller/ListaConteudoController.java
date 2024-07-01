package com.ex01Spring.ex01.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Lista-Controller")
public class ListaConteudoController {
	@GetMapping
	public List<String> listaObjetivos() {
        return Arrays.asList(
                "Aprender Spring Boot",
                "Aprender e reforçar sobre APIs REST",
                "Aplicar o que estou aprendendo em projetos",
                "Ajudar meus amigos com dificuldades",
                "Tirar minhas dúvidas com os professores para dar o meu 100%"
                );
	}
}
