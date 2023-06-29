package com.nav.mvc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nav.mvc.models.Subject;
import com.nav.mvc.repositories.SubjectRepository;

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

}
