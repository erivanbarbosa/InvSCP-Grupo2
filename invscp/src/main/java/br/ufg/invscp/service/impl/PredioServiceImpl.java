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
		Predio predio = new Predio();
		predio.setLocalizacao(localizacao);
		predio.setNome(dto.getNome());
		predioRepository.save(predio);
	}
	
	@Override
	public void update(Long id, Predio predioUpdate) {
		Predio predio = predioRepository.findOne(id);
		Localization localizacao = localizationService.findLocalization(predioUpdate.getLocalizacao().getId());
		predio.setLocalizacao(localizacao);
		predio.setNome(predioUpdate.getNome());
		predioRepository.save(predio);
	}
	
	@Override
	public List<Predio> findAll() {
		return predioRepository.findAll();
	}
	
	@Override
	public Predio find(Long id ) {
		return predioRepository.findOne(id);
	}
	
	@Override
	public void delete(Long id) {
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