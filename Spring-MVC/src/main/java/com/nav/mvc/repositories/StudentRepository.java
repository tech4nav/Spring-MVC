package com.nav.mvc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nav.mvc.models.Student;

public interface StudentRepository  extends CrudRepository<Student, Integer> {

}
