package br.ufg.invscp.service;

import java.util.List;

import br.ufg.invscp.model.Predio;
import br.ufg.invscp.model.dto.PredioDTO;

public interface PredioService {

	List<Predio> findAll();

	void save(PredioDTO predio);

}
