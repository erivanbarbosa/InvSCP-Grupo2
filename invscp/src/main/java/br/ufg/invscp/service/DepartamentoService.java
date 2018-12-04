package br.ufg.invscp.service;

import java.util.List;

import br.ufg.invscp.model.Departamento;

public interface DepartamentoService {

	void save(Departamento departamento);

	void update(Long id, Departamento departamento);

	List<Departamento> findAll();

	Departamento find(Long id);

	void delete(Long id);

}
