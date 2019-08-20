package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.Persona;


public interface PersonaRepository extends CrudRepository<Persona,String> {

	
}
