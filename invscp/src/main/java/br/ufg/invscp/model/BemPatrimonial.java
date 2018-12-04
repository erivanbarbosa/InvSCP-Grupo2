package br.ufg.invscp.model;

import br.ufg.invscp.model.enuns.EnumMotivoBaixa;
import br.ufg.invscp.model.enuns.StatusBemPatrimonialEnum;

import br.ufg.invscp.model.enuns.TipoBaixaEnum;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@Entity
@Table(name = "bem_patrimonial")
public class BemPatrimonial extends EntidadeAbstrata {

  @Column
  @Enumerated(EnumType.STRING)
  private StatusBemPatrimonialEnum status;

  @Column
  private EnumMotivoBaixa tipoBaixaEnum;

  @ManyToOne
  private GrupoBemPatrimonial grupo;

  @Column(name = "numero_tombamento")
  private Long numeroTombamento;

  @Column(name = "nome")
  private String nome;

  @Column(name = "descricao")
  private String descricao;

  @Column(name = "valor")
  private Double valor;

  @Column(name = "marca")
  private String marca;

  @Column(name = "data_aquisicao")
  private Date dataAquisicao;

  @ManyToOne
  @JoinColumn(name = "id_sala", referencedColumnName = "id")
  private Sala sala;

  @OneToMany(mappedBy = "bemPatrimonial")
  private List<Movimentacao> movimentacoes;

  public StatusBemPatrimonialEnum getStatus() {
    return status;
  }

  public void setStatus(StatusBemPatrimonialEnum status) {
    this.status = status;
  }

  public GrupoBemPatrimonial getGrupo() {
    return grupo;
  }

  public void setGrupo(GrupoBemPatrimonial grupo) {
    this.grupo = grupo;
  }

  public Long getNumeroTombamento() {
    return numeroTombamento;
  }

  public void setNumeroTombamento(Long numeroTombamento) {
    this.numeroTombamento = numeroTombamento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Date getDataAquisicao() {
    return dataAquisicao;
  }

  public void setDataAquisicao(Date dataAquisicao) {
    this.dataAquisicao = dataAquisicao;
  }

  public List<Movimentacao> getMovimentacoes() {
    return movimentacoes;
  }

  public void setMovimentacoes(List<Movimentacao> movimentacoes) {
    this.movimentacoes = movimentacoes;
  }

  public Sala getSala() {
    return sala;
  }

  public void setSala(Sala sala) {
    this.sala = sala;
  }

  public EnumMotivoBaixa getTipoBaixaEnum() {
    return tipoBaixaEnum;
  }

  public void setTipoBaixaEnum(EnumMotivoBaixa tipoBaixaEnum) {
    this.tipoBaixaEnum = tipoBaixaEnum;
  }
}
