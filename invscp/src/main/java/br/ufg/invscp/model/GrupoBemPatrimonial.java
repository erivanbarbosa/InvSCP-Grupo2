package br.ufg.invscp.model;

import br.ufg.invscp.model.enumerator.PeriodoDepreciacaoEnum;
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

  private PeriodoDepreciacaoEnum periodoDepreciacao;

}
