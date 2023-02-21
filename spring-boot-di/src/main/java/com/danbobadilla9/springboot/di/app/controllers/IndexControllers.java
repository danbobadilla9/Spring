package com.danbobadilla9.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.danbobadilla9.springboot.di.app.models.service.IServicio;
import com.danbobadilla9.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexControllers {
	
	@Autowired
	@Qualifier("miServicioSimple")
	private IServicio servicio;
	
	/*@Autowired
	public IndexControllers(IServicio servicio) {
		this.servicio = servicio;
	}*/
	
	@GetMapping({"/index","","/"})
	public String index(Model model) {
		
		model.addAttribute("datos",servicio.operacion());
		return "index";
	}
	
	/*@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
