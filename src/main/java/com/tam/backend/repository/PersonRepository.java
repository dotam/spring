package com.tam.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.tam.backend.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{

}
