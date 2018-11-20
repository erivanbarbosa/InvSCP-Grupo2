package br.ufg.invscp.service;

import java.util.List;

import br.ufg.invscp.model.Localization;
import br.ufg.invscp.model.dto.LocalizationDTO;
import br.ufg.invscp.model.dto.PredioDTO;

public interface LocalizationService {

	void save(LocalizationDTO dto);

	void update(Long localizationId, LocalizationDTO dto);

	List<Localization> findAllLocalizations();

	Localization findLocalization(Long localizationId);

	void delete(Long localizationId);
}
