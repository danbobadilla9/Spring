package com.danbobadilla9.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.danbobadilla9.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model ) {
		model.addAttribute("titulo","Hola enviando datos con Model");
		return "index";
	}
	
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Dan");
		usuario.setApellido("Bobadilla");
		usuario.setEmail("danbobadilla9@hotmail.com");
		model.addAttribute("usuario",usuario);
		model.addAttribute("title","Perfil del Usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Dan","Bobadilla","danobadilla9@hotmail.com"));
		usuarios.add(new Usuario("Israel","Segundo","danisrael@hotmail.com"));
		usuarios.add(new Usuario("Jose","Perez","josePerez9@hotmail.com"));
		model.addAttribute("title","Listado de usuarios");
		model.addAttribute("usuarios",usuarios);
		return "listar";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
