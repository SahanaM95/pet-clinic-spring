package com.example.petclinicspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.petclinicspring.service.VetService;

@org.springframework.stereotype.Controller
public class VetController {

	
	private final VetService service;
	
	
	public VetController(VetService service) {
		super();
		this.service = service;
	}


	@RequestMapping({"/vets"})
	public String listvets(Model model) {
		model.addAttribute("vets", service.findAll());
		return "vets/index";
	}
}
