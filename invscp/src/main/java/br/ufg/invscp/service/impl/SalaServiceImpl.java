package br.ufg.invscp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.ufg.invscp.model.Departamento;
import br.ufg.invscp.model.Predio;
import br.ufg.invscp.model.Sala;
import br.ufg.invscp.model.dto.SalaDTO;
import br.ufg.invscp.repository.PredioRepository;
import br.ufg.invscp.repository.SalaRepository;
import br.ufg.invscp.service.DepartamentoService;
import br.ufg.invscp.service.SalaService;

public class SalaServiceImpl implements SalaService{
	@Autowired 
	private PredioRepository predioRepository;
	
	@Autowired
	private SalaRepository salaRepository;
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@Override
	public void save(SalaDTO dto) {
		Predio predio = predioRepository.findOne(dto.getPredioId());
		Departamento departamento = departamentoService.find(dto.getDepartamentoId());
		Sala sala = new Sala(dto.getNumero(), dto.getTipo(), predio, departamento);
		
		salaRepository.save(sala);
	}
	
	@Override
	public void update(Long salaId, SalaDTO dto ) {
		Sala sala = salaRepository.findOne(salaId);
		Predio predio = predioRepository.findOne(dto.getPredioId());
		Departamento departamento = departamentoService.find(dto.getDepartamentoId());
		
		sala.setNumero(dto.getNumero());
		sala.setTipo(dto.getTipo());
		sala.setPredio(predio);
		sala.setDepartamento(departamento);
		
		salaRepository.save(sala);		
	}
	
	@Override
	public List<Sala> findAll() {
		return salaRepository.findAll();
	}
	
	@Override
	public void delete(Long salaId) {
		salaRepository.delete(salaId);
	}
	
	@Override
	public Sala find(Long salaId) {
		return salaRepository.findOne(salaId);
	}
	
}
