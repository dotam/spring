package com.tam.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.tam.backend.entities.Person;
import com.tam.backend.repository.PersonRepository;
import com.tam.backend.services.PersonService;

@Component
@Scope("view")
public class PersonBean{

	private Person person;
	@Autowired
	private PersonService personService;
	@Autowired
	private PersonRepository personRepository;
	private List<Person> listPersons;
	
	public void addPerson(Person person){
		this.personRepository.save(person);
		this.person = null;
	}
	public void deletePerson(Person person){
//		this.listPersons.remove(person);
		this.personRepository.delete(person);
		
	}
	
	public List<Person> getListPersons(){
		return this.personService.listPersons();
	}
	public Person getPerson() {
		if(person == null){
			person = new Person();
		}
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
