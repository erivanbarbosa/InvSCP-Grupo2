package br.ufg.invscp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufg.invscp.model.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long> {

  
}
