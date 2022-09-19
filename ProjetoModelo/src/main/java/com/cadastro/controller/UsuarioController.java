package com.cadastro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

	@GetMapping("/user")
	public String helloWorld() { 
		return "Hi, there!";
	}
}