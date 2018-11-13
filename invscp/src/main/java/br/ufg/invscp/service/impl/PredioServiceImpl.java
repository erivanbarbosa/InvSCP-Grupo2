package br.ufg.invscp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.invscp.model.dto.PredioDTO;
import br.ufg.invscp.repository.PredioRepository;
import br.ufg.invscp.service.PredioService;


@Service
public class PredioServiceImpl implements PredioService {
	
	@Autowired PredioRepository predioRepository;
	
	public void save(PredioDTO dto) {
		
	}

}