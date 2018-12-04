package br.ufg.invscp.model;

import br.ufg.invscp.model.enumerator.StatusBemPatrimonialEnum;
import br.ufg.invscp.model.enumerator.TipoBaixaEnum;
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
  private String codigo;

  private String nome;

  @Column
  private StatusBemPatrimonialEnum status;

  private TipoBaixaEnum tipoBaixa;

  @ManyToOne
  private GrupoBemPatrimonial grupo;


  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public StatusBemPatrimonialEnum getStatus() {
    return status;
  }

  public void setStatus(StatusBemPatrimonialEnum status) {
    this.status = status;
  }

  public TipoBaixaEnum getTipoBaixa() {
    return tipoBaixa;
  }

  public void setTipoBaixa(TipoBaixaEnum tipoBaixa) {
    this.tipoBaixa = tipoBaixa;
  }

  public GrupoBemPatrimonial getGrupo() {
    return grupo;
  }

  public void setGrupo(GrupoBemPatrimonial grupo) {
    this.grupo = grupo;
  }
}
