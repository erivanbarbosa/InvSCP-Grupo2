package br.ufg.invscp.repository;

import br.ufg.invscp.model.Localization;
import br.ufg.invscp.model.Predio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PredioRepository extends JpaRepository<Predio, Long> {

  
}
