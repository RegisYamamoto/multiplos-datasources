package com.regis.multiplosdatasources.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regis.multiplosdatasources.model.Estado;
import com.regis.multiplosdatasources.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> listarTodosEstados() {
		return estadoRepository.findAll();
	}

}