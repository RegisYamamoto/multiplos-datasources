package com.regis.multiplosdatasources.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.multiplosdatasources.model.Estado;
import com.regis.multiplosdatasources.service.EstadoService;

@RestController
@RequestMapping(value = "estados")
public class EstadoController {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping(value = "")
	public List<Estado> listarTodosEstados() {
		return estadoService.listarTodosEstados();
	}
	
}