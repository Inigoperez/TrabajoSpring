package com.Colegio.colegio;

import org.springframework.data.repository.CrudRepository;

import com.Colegio.colegio.Alumnos;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AlumnoRespository extends CrudRepository<Alumnos, String> {


	public Alumnos findByNombre(String Nombre);

	public void deleteByNombre(String Nombre);



}