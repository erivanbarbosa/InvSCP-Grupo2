package br.ufg.invscp.model.dto;

public class DepartamentoDTO {
	private Long id;
	private String nome;
	private Long chefeId;

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

	public Long getChefeId() {
		return chefeId;
	}

	public void setChefeId(Long chefeId) {
		this.chefeId = chefeId;
	}
}
