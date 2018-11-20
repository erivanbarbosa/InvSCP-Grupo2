package br.ufg.invscp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.ufg.invscp.model.Predio;
import br.ufg.invscp.model.Sala;
import br.ufg.invscp.model.dto.SalaDTO;
import br.ufg.invscp.repository.PredioRepository;
import br.ufg.invscp.repository.SalaRepository;
import br.ufg.invscp.service.SalaService;

public class SalaServiceImpl implements SalaService{
	@Autowired 
	private PredioRepository predioRepository;
	
	@Autowired
	private SalaRepository salaRepository;
	
	public void save(SalaDTO dto) {
		Predio predio = predioRepository.findOne(dto.getPredioId());
		Sala sala = new Sala(dto.getNumero(), dto.getTipo(), predio);
		
		salaRepository.save(sala);
	}
	
	public void update(Long salaId, SalaDTO dto ) {
		Sala sala = salaRepository.findOne(salaId);
		Predio predio = predioRepository.findOne(dto.getPredioId());
		
		sala.setNumero(dto.getNumero());
		sala.setTipo(dto.getTipo());
		sala.setPredio(predio);
		
		salaRepository.save(sala);		
	}
	
	public List<Sala> findAll() {
		return salaRepository.findAll();
	}
	
	public void delete(Long salaId) {
		salaRepository.delete(salaId);
	}
	
	public Sala find(Long salaId) {
		return salaRepository.findOne(salaId);
	}
	
}
