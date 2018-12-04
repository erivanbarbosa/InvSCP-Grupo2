package br.ufg.invscp.model.dto;

import br.ufg.invscp.model.BemPatrimonial;
import br.ufg.invscp.model.enuns.StatusBemPatrimonialEnum;
import br.ufg.invscp.model.enuns.TipoBaixaEnum;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Iago Bruno
 * @since 1.0
 */
public class BemPatrimonialDTO {

  private Long id;

  private Long grupoBemPatrimonialId;

  private Long numeroTombamento;

  private String nome;

  private String descricao;

  private Double valor;

  private String marca;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date dataAquisicao;

  private StatusBemPatrimonialEnum status;

  private TipoBaixaEnum tipoBaixaEnum;

  public BemPatrimonialDTO() {
    // Default
  }

  public BemPatrimonialDTO(Long grupoBemPatrimonialId, Long numeroTombamento, String nome,
      String descricao, Double valor, String marca, Date dataAquisicao,
      StatusBemPatrimonialEnum status, TipoBaixaEnum tipoBaixaEnum) {
    this.grupoBemPatrimonialId = grupoBemPatrimonialId;
    this.numeroTombamento = numeroTombamento;
    this.nome = nome;
    this.descricao = descricao;
    this.valor = valor;
    this.marca = marca;
    this.dataAquisicao = dataAquisicao;
    this.status = status;
    this.tipoBaixaEnum = tipoBaixaEnum;
  }

  public Long getGrupoBemPatrimonialId() {
    return grupoBemPatrimonialId;
  }

  public void setGrupoBemPatrimonialId(Long grupoBemPatrimonialId) {
    this.grupoBemPatrimonialId = grupoBemPatrimonialId;
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

  public StatusBemPatrimonialEnum getStatus() {
    return status;
  }

  public void setStatus(StatusBemPatrimonialEnum status) {
    this.status = status;
  }

  public TipoBaixaEnum getTipoBaixaEnum() {
    return tipoBaixaEnum;
  }

  public void setTipoBaixaEnum(TipoBaixaEnum tipoBaixaEnum) {
    this.tipoBaixaEnum = tipoBaixaEnum;
  }


  public void setAtributosBemPatrimonial(BemPatrimonial bemPatrimonial){

    if (bemPatrimonial.getGrupo() != null){
      this.grupoBemPatrimonialId = bemPatrimonial.getGrupo().getId();
    }

    BeanUtils.copyProperties(bemPatrimonial, this);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
