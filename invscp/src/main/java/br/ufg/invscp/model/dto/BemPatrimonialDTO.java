package br.ufg.invscp.model.dto;

import br.ufg.invscp.model.enumerator.StatusBemPatrimonialEnum;
import br.ufg.invscp.model.enumerator.TipoBaixaEnum;

/**
 * @author Iago Bruno
 * @since 1.0
 */
public class BemPatrimonialDTO {

  private Long grupoBemPatrimonialId;

  private String codigo;

  private String nome;

  private StatusBemPatrimonialEnum status;

  private TipoBaixaEnum tipoBaixa;

  public Long getGrupoBemPatrimonialId() {
    return grupoBemPatrimonialId;
  }

  public void setGrupoBemPatrimonialId(Long grupoBemPatrimonialId) {
    this.grupoBemPatrimonialId = grupoBemPatrimonialId;
  }

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
}
