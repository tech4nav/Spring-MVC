package com.nav.mvc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nav.mvc.models.Subject;
import com.nav.mvc.repositories.SubjectRepository;

import jakarta.transaction.Transactional;

@Service
public class SubjectServices {
	
@Autowired 
private SubjectRepository subJectRepository;
	
public List<Subject> listAllSubjects(){
	
	ArrayList<Subject> sub=(ArrayList<Subject>) subJectRepository.findAll();
	return sub;
}

public Subject addNewSubject(Subject sub)
{
	return subJectRepository.save(sub);
}

public Subject findSubject(Integer id)
{
	Optional<Subject> sub=subJectRepository.findById(id);
	return sub.get();
}

@Transactional
public Subject updateSubject(Integer id)
{
	Optional<Subject> sub=subJectRepository.findById(id);
	subJectRepository.updateSubjectById(sub.get().getSubjectName(),sub.get().getSubjectDesc(),id);
	return subJectRepository.findById(id).get();
}

public void deleteSubject(Integer id)
{
	subJectRepository.deleteById(id);
}

}
