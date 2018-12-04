package br.ufg.invscp.model.dto;

public class SalaDTO {
	private Long id;
	private String numero;
	private int tipo;
	private Long predioId;
	private Long departamentoId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Long getPredioId() {
		return predioId;
	}

	public void setPredioId(Long predioId) {
		this.predioId = predioId;
	}

	public Long getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}

}
