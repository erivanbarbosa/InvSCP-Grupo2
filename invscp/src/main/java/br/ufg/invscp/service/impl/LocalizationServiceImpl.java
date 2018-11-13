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
  
	@Override
	public void save(LocalizationDTO dto ) {
		Localization localization = new Localization(dto.getName(), dto.getAddress());
		localizationRepository.save(localization);
	}
	
	@Override
	public void update(Long localizationId, LocalizationDTO dto ) {
		Localization localization = findLocalization(localizationId);
		localization.setName(dto.getName());
		localization.setAddress(dto.getAddress());
		localizationRepository.save(localization);
	}
	
	@Override
	public List<Localization> findAllLocalizations() {
		return localizationRepository.findAll();
	}
	
	@Override
	public Localization findLocalization(Long localizationId) {
		return ofNullable(localizationRepository.findOne(localizationId))
				.orElseThrow(() -> new EntityNotFoundException("localizationNotFound"));
	}
	
	@Override
	public void delete(Long localizationId) {
		localizationRepository.delete(localizationId);
	}
}