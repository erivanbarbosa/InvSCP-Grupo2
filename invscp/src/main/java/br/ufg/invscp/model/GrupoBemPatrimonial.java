package br.ufg.invscp.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@Entity
@Table(name = "grupo_bem_patrimonial")
public class GrupoBemPatrimonial extends EntidadeAbstrata {

  private String nome;

  private BigDecimal percentual;
  
}
