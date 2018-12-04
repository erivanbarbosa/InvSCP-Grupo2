package br.ufg.invscp.model;

import java.util.Date;
import java.util.List;

import br.ufg.invscp.model.enuns.EnumSituacaoOS;

public class OrdemServico {
	private Date dataConserto;
	private Long numero;
	private Date dataInicial;
	private Long prestador;
	private EnumSituacaoOS situacao;
	private Date dataDevolucao;
	private Double valor;
	private GrupoBemPatrimonial grupoBemPatrimonial;
	private List<BemPatrimonial> bensPatrimoniais;
}
