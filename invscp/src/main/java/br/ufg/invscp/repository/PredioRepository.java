package br.ufg.invscp.repository;

import br.ufg.invscp.model.Localization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredioRepository extends JpaRepository<Localization, Long> {

  
}
