package br.ufg.invscp.service.impl;

import java.util.List;
import static java.util.Optional.ofNullable;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.invscp.model.Localization;
import br.ufg.invscp.model.dto.LocalizationDTO;
import br.ufg.invscp.repository.LocalizationRepository;
import br.ufg.invscp.service.LocalizationService;


@Service
public class LocalizationServiceImpl implements LocalizationService {
	
	@Autowired
	private LocalizationRepository localizationRepository;
  
	public void save(LocalizationDTO dto ) {
		Localization localization = new Localization(dto.getName(), dto.getAddress());
		localizationRepository.save(localization);
	}
	
	public void update(Long localizationId, LocalizationDTO dto ) {
		Localization localization = findLocalization(localizationId);
		localization.setName(dto.getName());
		localization.setAddress(dto.getAddress());
		localizationRepository.save(localization);
	}
	
	public List<Localization> findAllLocalizations() {
		return localizationRepository.findAll();
	}
	
	public Localization findLocalization(Long localizationId) {
		return ofNullable(localizationRepository.findOne(localizationId))
				.orElseThrow(() -> new EntityNotFoundException("localizationNotFound"));
	}
	
	public void delete(Long localizationId) {
		localizationRepository.delete(localizationId);
	}
}