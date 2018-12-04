package br.ufg.invscp.service.impl;

import static java.util.Optional.ofNullable;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import br.ufg.invscp.model.Departamento;
import br.ufg.invscp.repository.DepartamentoRepository;
import br.ufg.invscp.service.DepartamentoService;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{
	
	@Autowired
	DepartamentoRepository departamentoRepository;
	
	@Override
	public void save(Departamento departamento) {
		departamentoRepository.save(departamento);
	}
	
	@Override
	public void update(Long id, Departamento novoDepartamento) {
		Departamento departamento = find(id);
		departamento.setChefe(novoDepartamento.getChefe());
		departamento.setNome(novoDepartamento.getNome());
		departamento.setSalas(novoDepartamento.getSalas());
		departamentoRepository.save(departamento);
	}
	
	@Override
	public List<Departamento> findAll() {
		return departamentoRepository.findAll();
	}
	
	@Override
	public Departamento find(Long id ) {
		return ofNullable(departamentoRepository.findOne(id))
				.orElseThrow(() -> new EntityNotFoundException("departamentoNotFound"));
	}
	
	
	@Override
	public void delete(Long id) {
		departamentoRepository.delete(id);
	}
}
