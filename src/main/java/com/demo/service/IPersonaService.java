package com.demo.service;

import com.demo.model.Persona;

public interface IPersonaService {
	public Iterable<Persona> buscarTodos();

	public void insertar(Persona persona);

	public void borrar(Persona persona);
}
