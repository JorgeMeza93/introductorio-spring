package com.bolsadeides.springboot.web.app.controller;

import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
	
	public String index(){
		return "index";
	}
}
