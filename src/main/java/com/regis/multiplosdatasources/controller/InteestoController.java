package com.regis.multiplosdatasources.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.multiplosdatasources.model.regis.Inteesto;
import com.regis.multiplosdatasources.service.InteestoService;

@RestController
@RequestMapping(value = "/inteestos")
public class InteestoController {

	@Autowired
	private InteestoService inteestoService;
	
	@GetMapping(value = "")
	public List<Inteesto> listarTodosInteestos() {
		return inteestoService.listarTodosInteestos();
	}
	
}