package br.ufg.invscp.model;

import br.ufg.invscp.model.enumerator.StatusBemPatrimonialEnum;

import java.util.Date;
import java.util.List;

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
  
  private Long numeroTombamento;
  private String nome;
  private String descricao;
  private Double valor;
  private Double taxaDepreciacao;
  private String marca;
  private Date dataAquisicao;
  private List<Movimentacao> movimentacoes;
  private Sala sala;


}
