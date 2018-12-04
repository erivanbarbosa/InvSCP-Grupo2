package br.ufg.invscp.service;

import java.util.List;

import br.ufg.invscp.model.Sala;
import br.ufg.invscp.model.dto.SalaDTO;

public interface SalaService {

	void save(SalaDTO dto);

	Sala find(Long salaId);

	List<Sala> findAll();

	void delete(Long salaId);

	void update(Long salaId, SalaDTO dto);

	SalaDTO findDTO(Long id);
	
}
