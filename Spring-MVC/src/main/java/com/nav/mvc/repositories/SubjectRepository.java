package com.nav.mvc.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nav.mvc.models.Subject;

import jakarta.transaction.Transactional;

public interface SubjectRepository  extends CrudRepository<Subject, Integer>{

	
	@Modifying
	@Transactional
	@Query("update Subject u set u.subjectName = ?1, u.subjectDesc = ?2 where u.id = ?3")
	void updateSubjectById(String subjectName, String subjectDesc, Integer id);
}
