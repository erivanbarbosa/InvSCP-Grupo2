package br.ufg.invscp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.invscp.model.Localization;
import br.ufg.invscp.model.Predio;
import br.ufg.invscp.model.Sala;
import br.ufg.invscp.model.dto.PredioDTO;
import br.ufg.invscp.repository.PredioRepository;
import br.ufg.invscp.repository.SalaRepository;
import br.ufg.invscp.service.LocalizationService;
import br.ufg.invscp.service.PredioService;


@Service
public class PredioServiceImpl implements PredioService {
	
	@Autowired PredioRepository predioRepository;
	@Autowired LocalizationService localizationService;
	@Autowired SalaRepository salaRepository;
	
	public void save(PredioDTO dto) {
		Localization localizacao = localizationService.findLocalization(dto.getLocalizacaoId());
		List<Sala> salas = findSalas(dto.getSalasId());
		
		Predio predio = new Predio(localizacao, salas);
		
		predioRepository.save(predio);
	}
	
	public void update(Long id, PredioDTO dto) {
		Predio predio = predioRepository.findOne(id);
		Localization localizacao = localizationService.findLocalization(dto.getLocalizacaoId());
		List<Sala> salas = findSalas(dto.getSalasId());
		
		predio.setLocalizacao(localizacao);
		predio.setSalas(salas);
		
		predioRepository.save(predio);
	}
	
	public List<Predio> findAll() {
		return predioRepository.findAll();
	}
	
	public Predio find(Long id ) {
		return predioRepository.findOne(id);
	}
	
	public void delte(Long id) {
		predioRepository.delete(id);
	}

	private List<Sala> findSalas(List<Long> salasId) {
		List<Sala> salas = new ArrayList<Sala>();

		salasId.forEach(id -> {
			salas.add(salaRepository.findOne(id));
		});
		
		return salas;
	}

}