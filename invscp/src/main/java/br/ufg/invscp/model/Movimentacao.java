package br.ufg.invscp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.ufg.invscp.model.enuns.EnumMotivoBaixa;
import br.ufg.invscp.model.enuns.EnumSituacaoMovimentacao;

@Entity
@Table(name = "movimentacao")
public class Movimentacao extends EntidadeAbstrata{
	private EnumSituacaoMovimentacao situacao;
	private Date dataCancelamento;
	private EnumMotivoBaixa motivoBaixa;

	@ManyToOne
	private Origem origem;

	@ManyToOne
	private Destino destino;
	
	@ManyToOne
	@JoinColumn(name = "id_movimentacao", referencedColumnName = "id")
	private Localization localizacao;

	@ManyToOne
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
