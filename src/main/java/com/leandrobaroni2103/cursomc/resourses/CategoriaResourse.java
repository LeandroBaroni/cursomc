package com.leandrobaroni2103.cursomc.resourses;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourse {

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST esta funcionando";
	}
}