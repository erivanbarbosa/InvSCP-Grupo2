package br.ufg.invscp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufg.invscp.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

  
}
