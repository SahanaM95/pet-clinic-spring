package com.example.petclinicspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.petclinicspring.service.OwnerService;

@RequestMapping("/owners")
@org.springframework.stereotype.Controller
public class OwnerController {

	@Autowired
	OwnerService service;
	
	@RequestMapping({"","/"})
	public String listOwners(Model model) {
		model.addAttribute("owners", service.findAll());
		return "owners/index";
	}
}
