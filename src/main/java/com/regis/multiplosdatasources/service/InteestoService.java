package com.regis.multiplosdatasources.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regis.multiplosdatasources.model.regis.Inteesto;
import com.regis.multiplosdatasources.repository.regis.InteestoRepository;

@Service
public class InteestoService {

	@Autowired
	private InteestoRepository inteestoRepository;
	
	public List<Inteesto> listarTodosInteestos() {
		return inteestoRepository.findAll();
	}
}