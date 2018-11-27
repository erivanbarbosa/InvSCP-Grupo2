package br.ufg.invscp.model;

import br.ufg.invscp.model.enumerator.StatusBemPatrimonialEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@Entity
@Table(name = "bem_patrimonial")
public class BemPatrimonial extends EntidadeAbstrata {

  @Column
  private StatusBemPatrimonialEnum status;

  @ManyToOne
  private GrupoBemPatrimonial grupo;


}
