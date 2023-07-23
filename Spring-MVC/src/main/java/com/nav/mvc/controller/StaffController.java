package com.nav.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nav.mvc.models.Staff;
import com.nav.mvc.services.MasterDataServices;
import com.nav.mvc.services.StaffService;

@Controller
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	@Autowired
	private MasterDataServices masterDataServices;
	
	@GetMapping("/admin/addStaffForm")
	public String showStaffForm(Model model) {
		model.addAttribute("roleList", masterDataServices.listAllRoles());
		model.addAttribute("staff", new Staff());
		return "staff/showStaffForm";
	}
	
	@GetMapping("/staff")
	public String getAllStaff(Model model)
	{
		model.addAttribute("listStaff", staffService.listAllStaff());
		return "staff/viewStaff";
	}
	
	@PostMapping("/admin/addStaff")
	public String AddSubject(@ModelAttribute Staff staff, Model model)
	{
		staffService.addNewStaff(staff);
		return getAllStaff(model);
	}

}
