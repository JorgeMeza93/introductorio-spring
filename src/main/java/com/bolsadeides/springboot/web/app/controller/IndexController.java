package com.bolsadeides.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeides.springboot.web.app.model.Usuario;

@Controller
@RequestMapping("/app/")
public class IndexController {
	
	@RequestMapping	(value = {"/index", "/", "", "/home"}, method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("titulo", "Aprendiendo Spring");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model){
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Jorge");
		usuario1.setApellido("Meza");
		usuario1.setEmail("jorge@gmail.com");
		model.addAttribute("usuario", usuario1);
		model.addAttribute("titulo", "Perfil del usuario".concat(usuario1.getNombre()));
		return "perfil";
	}
	@RequestMapping("/listar")
	public String listar(Model model){
		List<Usuario> usuarios = new ArrayList<>();
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo", "Listado de Usuarios");
		return "listar";
	}
	
	
}
