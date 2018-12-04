package br.ufg.invscp.service.impl;

import static java.util.Optional.ofNullable;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import br.ufg.invscp.model.Departamento;
import br.ufg.invscp.model.Usuario;
import br.ufg.invscp.model.dto.DepartamentoDTO;
import br.ufg.invscp.repository.DepartamentoRepository;
import br.ufg.invscp.repository.UsuarioRepository;
import br.ufg.invscp.service.DepartamentoService;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{
	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void save(DepartamentoDTO dto) {
		Departamento departamento = new Departamento();
		Usuario chefe = usuarioRepository.findOne(dto.getChefeId());
		departamento.setNome(dto.getNome());
		departamento.setChefe(chefe);
		departamentoRepository.save(departamento);
	}
	
	@Override
	public void update(Long id, DepartamentoDTO dto) {
		Departamento departamento = find(id);
		Usuario chefe = usuarioRepository.findOne(dto.getChefeId());
		departamento.setChefe(chefe);
		departamento.setNome(dto.getNome());
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
	public DepartamentoDTO findDTO(Long id ) {
		Departamento departamento = find(id);
		DepartamentoDTO dto = new DepartamentoDTO();
		dto.setId(departamento.getId());
		dto.setNome(departamento.getNome());
		dto.setChefeId(dto.getChefeId());
		return dto;
	}
	
	
	@Override
	public void delete(Long id) {
		departamentoRepository.delete(id);
	}
}
