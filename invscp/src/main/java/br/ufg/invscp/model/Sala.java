package br.ufg.invscp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sala")
public class Sala extends EntidadeAbstrata {
	private String numero;
	private int tipo;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "predio_id")
	private Predio predio;

	public Sala(String numero, int tipo, Predio predio) {
		this.numero = numero;
		this.tipo = tipo;
		this.predio = predio;
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

	public Predio getPredio() {
		return predio;
	}

	public void setPredio(Predio predio) {
		this.predio = predio;
	}
}
