package com.nelioalves.cursomc.resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResourse {
	
	
	//@GetMapping
	@RequestMapping(method=RequestMethod.GET)
	public String listar(){
		return "Rest está funcionando";
	}
	

}
