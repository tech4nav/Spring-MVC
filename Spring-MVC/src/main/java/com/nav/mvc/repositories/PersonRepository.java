package com.nav.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nav.mvc.models.Person;

import jakarta.transaction.Transactional;

public interface PersonRepository  extends CrudRepository<Person, Integer> {

	@Modifying
	@Transactional
	@Query("SELECT p from Person p where p.userName = ?1")
	public List<Person> findByUsername(String username);

}
