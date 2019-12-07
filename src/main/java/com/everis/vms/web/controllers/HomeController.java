package com.everis.vms.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@RequestMapping("/home")
	public String welcomeToVMS() {
		return "Welcome to VMS Application";
	}
	
}
