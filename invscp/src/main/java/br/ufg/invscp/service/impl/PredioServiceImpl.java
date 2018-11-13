package br.ufg.invscp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.invscp.model.Localization;
import br.ufg.invscp.model.Predio;
import br.ufg.invscp.model.dto.PredioDTO;
import br.ufg.invscp.repository.PredioRepository;
import br.ufg.invscp.service.LocalizationService;
import br.ufg.invscp.service.PredioService;


@Service
public class PredioServiceImpl implements PredioService {
	
	@Autowired PredioRepository predioRepository;
	@Autowired LocalizationService localizationService;
	
	public void save(PredioDTO dto) {
		Localization localizacao = localizationService.findLocalization(dto.getLocalizacaoId());
		Predio predio = new Predio();
		predio.setLocalizacao(localizacao);
		
		predioRepository.save(predio);
	}

}