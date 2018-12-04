package br.ufg.invscp.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Destino extends EntidadeAbstrata {

  @ManyToOne
  private Movimentacao movimentacao;

  @ManyToOne
  private Usuario usuarioDestino;

  private Date data;

  @ManyToOne
  private Sala salaDestino;

  public Movimentacao getMovimentacao() {
    return movimentacao;
  }

  public void setMovimentacao(Movimentacao movimentacao) {
    this.movimentacao = movimentacao;
  }

  public Usuario getUsuarioDestino() {
    return usuarioDestino;
  }

  public void setUsuarioDestino(Usuario usuarioDestino) {
    this.usuarioDestino = usuarioDestino;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public Sala getSalaDestino() {
    return salaDestino;
  }

  public void setSalaDestino(Sala salaDestino) {
    this.salaDestino = salaDestino;
  }
}
