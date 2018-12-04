package br.ufg.invscp.model.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import br.ufg.invscp.model.enuns.EnumMotivoBaixa;

public class BaixaBemPatrimonialDTO {

	private Long id;
	private String nome;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;
	private EnumMotivoBaixa motivo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public EnumMotivoBaixa getMotivo() {
		return motivo;
	}

	public void setMotivo(EnumMotivoBaixa motivo) {
		this.motivo = motivo;
	}

}
