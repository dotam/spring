package com.tam.backend.services;

import java.util.List;

import com.tam.backend.entities.Person;

public interface PersonService {
	
	List<Person> findAll();

	Person findOne(Long id);

	Person save(Person entity);

	void delete(Person entity);

	void delete(Long id);
	
	public List<Person> listPersons();
}
