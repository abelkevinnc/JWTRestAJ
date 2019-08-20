package com.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Persona;
import com.demo.repository.PersonaRepository;

@RestController
@RequestMapping("webapi")
public class PersonaRestController {
	
	@Autowired
	PersonaRepository repositorio;
	
	@GetMapping("/personas")
	public Iterable<Persona> buscarTodos() {
		return repositorio.findAll();
	}

}
