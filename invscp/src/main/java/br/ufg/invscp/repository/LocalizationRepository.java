package br.ufg.invscp.repository;

import br.ufg.invscp.model.Localization;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizationRepository extends JpaRepository<Localization, Long> {

  
}
