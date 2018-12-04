package br.ufg.invscp.service;

import java.util.List;

import br.ufg.invscp.model.Departamento;
import br.ufg.invscp.model.dto.DepartamentoDTO;

public interface DepartamentoService {

	List<Departamento> findAll();

	Departamento find(Long id);

	void delete(Long id);

	void save(DepartamentoDTO dto);

	void update(Long id, DepartamentoDTO dto);

	DepartamentoDTO findDTO(Long id);

}
