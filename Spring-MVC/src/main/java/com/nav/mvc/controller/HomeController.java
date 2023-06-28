package com.nav.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nav.mvc.models.Address;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}

}
