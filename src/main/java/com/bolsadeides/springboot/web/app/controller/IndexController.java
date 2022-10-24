package com.bolsadeides.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app/")
public class IndexController {
	
	@RequestMapping	(value = {"/index", "/", "", "/home"}, method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("titulo", "Aprendiendo Spring");
		return "index";
	}
}
