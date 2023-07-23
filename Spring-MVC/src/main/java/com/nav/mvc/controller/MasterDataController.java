package com.nav.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nav.mvc.models.App_Role;
import com.nav.mvc.models.Subject;
import com.nav.mvc.services.MasterDataServices;
import com.nav.mvc.services.SubjectServices;

@Controller
public class MasterDataController {
	
	@Autowired
	private MasterDataServices masterDataServices;
	
	@GetMapping("/admin/roles")
	public String getAllRoles(Model model)
	{
		model.addAttribute("listRoles", masterDataServices.listAllRoles());
		return "masterData/listRoles";
	}
	
	@GetMapping("/admin/addRole")
	public String showAddRole(Model model)
	{
		model.addAttribute("role", new App_Role());
		return "masterData/addNewRole";
	}
	
	@PostMapping("/admin/addRole")
	public String AddRole(@ModelAttribute App_Role role, Model model)
	{
		masterDataServices.addNewRole(role);
		return getAllRoles(model);
	}
	
	@GetMapping("/admin/updateRole")
	public String updateRole( Model model)
	{
		getAllRoles(model);
		return "masterData/updateRole";
	}
	
	@GetMapping("/admin/updateRole/{id}")
	public String updateRole(@PathVariable Integer id, Model model)
	{
		model.addAttribute("role", masterDataServices.findRole(id));
		return "masterData/addNewRole";
	}
	
	@GetMapping("/admin/deleteRole/{id}")
	public String deleteRoles(@PathVariable Integer id, Model model)
	{
		masterDataServices.deleteRole(id);
		return getAllRoles(model);
	}

}
