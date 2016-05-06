package com.tam.backend.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.jpa.internal.EntityManagerFactoryRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysema.query.jpa.JPQLQuery;
import com.mysema.query.jpa.impl.JPAQuery;
import com.tam.backend.entities.Person;
import com.tam.backend.entities.QPerson;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private EntityManagerFactory emf;
//	@Autowired
//	private PersonRepository personRepository;
	
//	@Transactional
	public List<Person> findAll() {
//		return (List<Person>) this.personDao.findAll();
		return null;
	}

//	@Transactional
	public Person findOne(Long id) {
//		return this.personDao.findOne(id);
		return null;
	}

//	@Transactional
	public Person save(Person entity) {
		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
		  em.persist(entity);
//		  em.getTransaction().commit();
//		  em.close();
		return entity;
	}

//	@Transactional
	public void delete(Long id) {
//		this.personDao.delete(id);
	}

	@Transactional
	public void delete(Person entity) {
//		this.personDao.delete(entity);
	}
	@Transactional
	public List<Person> listPersons() {
		EntityManager em =  emf.createEntityManager();
		QPerson qPerson = QPerson.person;
		JPQLQuery query = new JPAQuery(em);
		List<Person> result = query.from(qPerson)
				.list(qPerson);
		em.close();
//		return  (List<Person>) personRepository.findAll();
		return result;
	}

	// private PersonDAO personDAO;
	// public void setPersonDAO(PersonDAO personDAO) {
	// this.personDAO = personDAO;
	// }
	//
	// public void addPerson(Person person) {
	// // TODO Auto-generated method stub
	// this.personDAO.addPerson(person);
	//
	// }
	//
	// public List<Person> listPersons() {
	// // TODO Auto-generated method stub
	// return this.personDAO.listPersons();
	// }

}
