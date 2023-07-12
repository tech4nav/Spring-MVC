package com.nav.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/updateSubject")
	public String updateSubject( Model model)
	{
		getAllSubjects(model);
		return "updateSubject";
	}
	
	@PostMapping("/updateSubject/{id}")
	public String updateSubjects(@PathVariable Integer id, Model model)
	{
		model.addAttribute("subject", subjectService.updateSubject(id));
		return "showSubjectForm";
	}
	
	@GetMapping("/deleteSubject/{id}")
	public String deleteSubjects(@PathVariable Integer id, Model model)
	{
		subjectService.deleteSubject(id);
		return updateSubject(  model);
	}

}
