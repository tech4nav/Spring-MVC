package com.nav.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nav.mvc.models.Student;
import com.nav.mvc.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/showStudentForm")
	public String showStodentForm(Model model) {
		model.addAttribute("student", new Student());
		return "student/showStudentForm";
	}
	
	@GetMapping("/students")
	public String getAllStudents(Model model)
	{
		model.addAttribute("listStudent", studentService.listAllStudents());
		return "student/viewStudents";
	}
	
	@PostMapping("/addStudent")
	public String AddSubject(@ModelAttribute Student student, Model model)
	{
		studentService.addNewStudent(student);
		return getAllStudents(model);
	}

}
