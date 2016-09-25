package com.vkn.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vkn.proj.service.WelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService service;
	
	@GetMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("name", "Devika K V");
		model.addAttribute("msg", service.getWelcomeMessage().getMessage());
		return "welcome";
	}
}
