package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Persona;
import com.demo.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	PersonaRepository repositorio;
	
	
	public Iterable<Persona> buscarTodos() {
		
		return repositorio.findAll();
	}
	
	public void insertar(Persona persona) {
		
		repositorio.save(persona);
	}
	
	public void borrar(Persona persona) {
		
		repositorio.delete(persona);
	}
	
	
	
}
