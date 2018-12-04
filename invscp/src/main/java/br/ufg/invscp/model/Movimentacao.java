package br.ufg.invscp.model;

import java.util.Date;

import br.ufg.invscp.model.enuns.EnumMotivoBaixa;
import br.ufg.invscp.model.enuns.EnumSituacaoMovimentacao;

public class Movimentacao {
	private EnumSituacaoMovimentacao situacao;
	private Date dataCancelamento;
	private EnumMotivoBaixa motivoBaixa;
	private Origem origem;
	private Destino destino;
	private BemPatrimonial bemPatrimonial;

	public EnumSituacaoMovimentacao getSituacao() {
		return situacao;
	}

	public void setSituacao(EnumSituacaoMovimentacao situacao) {
		this.situacao = situacao;
	}

	public Date getDataCancelamento() {
		return dataCancelamento;
	}

	public void setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}

	public EnumMotivoBaixa getMotivoBaixa() {
		return motivoBaixa;
	}

	public void setMotivoBaixa(EnumMotivoBaixa motivoBaixa) {
		this.motivoBaixa = motivoBaixa;
	}

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public BemPatrimonial getBemPatrimonial() {
		return bemPatrimonial;
	}

	public void setBemPatrimonial(BemPatrimonial bemPatrimonial) {
		this.bemPatrimonial = bemPatrimonial;
	}

}
