package com.nav.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nav.mvc.models.Student;
import com.nav.mvc.models.Subject;
import com.nav.mvc.services.SubjectServices;

@Controller
public class SubjectController {
	
	@Autowired
	private SubjectServices subjectService;
	
	@GetMapping("/subjects")
	public String getAllSubjects(Model model)
	{
		model.addAttribute("listSubject", subjectService.listAllSubjects());
		return "listSubject";
	}
	
	@GetMapping("/showSubjectForm")
	public String showAddSubject(Model model)
	{
		model.addAttribute("subject", new Subject());
		return "showSubjectForm";
	}
	
	@PostMapping("/addSubject")
	public String AddSubject(@ModelAttribute Subject subject, Model model)
	{
		subjectService.addNewSubject(subject);
		return getAllSubjects(model);
	}
	
	@PostMapping("/{d}")
	public String updateSubject()
	{
		
		return "subjects";
	}

}
