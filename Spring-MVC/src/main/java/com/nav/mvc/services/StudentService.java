package com.nav.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nav.mvc.models.Address;
import com.nav.mvc.models.Student;
import com.nav.mvc.repositories.AddressRepository;
import com.nav.mvc.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private AddressRepository addressRepository;

	public List<Student> listAllStudents() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepository.findAll();
	}

	public void addNewStudent(Student student) {
		/*
		 * student.getLstAddr().get(0).setPerson(student);
		 * student.setLstAddr(student.getLstAddr());
		 */
		Student std=studentRepository.save(student);
		Address adr=std.getLstAddr().get(0);
		adr.setPerson(student);
		addressRepository.save(adr);
	}

}
