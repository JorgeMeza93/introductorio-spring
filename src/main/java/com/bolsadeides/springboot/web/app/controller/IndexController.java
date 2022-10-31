package com.bolsadeides.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeides.springboot.web.app.model.Locacion;
import com.bolsadeides.springboot.web.app.model.Usuario;

@Controller
@RequestMapping("/app/")
public class IndexController {
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;
	
	@RequestMapping	(value = {"/index", "/", "", "/home"}, method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("titulo", textoIndex);
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model){
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Jorge");
		usuario1.setApellido("Meza");
		usuario1.setEmail("jorge@gmail.com");
		model.addAttribute("usuario", usuario1);
		model.addAttribute("titulo", textoPerfil.concat(usuario1.getNombre()));
		return "perfil";
	}
	@RequestMapping("/listar")
	public String listar(Model model){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Jorge", "Meza", "jorge@gmail.com"));
		usuarios.add(new Usuario("Daniel", "Lewis", "daniel.lewis@gmail.com"));
		usuarios.add(new Usuario("Jane", "Parker", "jane-parker@gmail.com"));
		usuarios.add(new Usuario("Tornado", "Roe", "tornado-roe@gmail.com"));
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo", "Listado de Usuarios");
		return "listar";
	}
	@RequestMapping("/locaciones")
	public String locaciones(Model model){
		model.addAttribute("titulo", textoListar);
		return "locaciones";
	}
	
	@ModelAttribute("locaciones")
	public List<Locacion> poblarLocaciones(){
		List<Locacion> locaciones = Arrays.asList(new Locacion("Philadelphia", "Pennsylvania", "USA"), new Locacion("New York City", "New York", "USA"));
		return locaciones;
	}
	
}
