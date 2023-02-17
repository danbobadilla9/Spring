package com.danbobadilla9.springboot.di.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.danbobadilla9.springboot.di.models.service.MiServicio;

@Controller
public class IndexControllers {

	
	@GetMapping("/index")
	public String index(Model model) {
		MiServicio servicio = new MiServicio();
		model.addAttribute("datos",servicio.operacion());
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
