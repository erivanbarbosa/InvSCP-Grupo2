package br.ufg.invscp.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Origem extends EntidadeAbstrata {


  @ManyToOne
  private Movimentacao movimentacao;

  @ManyToOne
  private Usuario usuarioOrigem;

  private Date data;

  @ManyToOne
  private Sala salaOrigem;

  public Movimentacao getMovimentacao() {
    return movimentacao;
  }

  public void setMovimentacao(Movimentacao movimentacao) {
    this.movimentacao = movimentacao;
  }

  public Usuario getUsuarioOrigem() {
    return usuarioOrigem;
  }

  public void setUsuarioOrigem(Usuario usuarioOrigem) {
    this.usuarioOrigem = usuarioOrigem;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public Sala getSalaOrigem() {
    return salaOrigem;
  }

  public void setSalaOrigem(Sala salaOrigem) {
    this.salaOrigem = salaOrigem;
  }
}
