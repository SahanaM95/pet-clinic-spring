package com.example.petclinicspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping({"","/","index","index.html"})
	public String index() {
		return "index";
	}
}
