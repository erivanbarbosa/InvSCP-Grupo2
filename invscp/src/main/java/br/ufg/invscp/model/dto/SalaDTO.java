package br.ufg.invscp.model.dto;

public class SalaDTO {
	private String numero;
	private int tipo;
	private Long predioId;

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

}
