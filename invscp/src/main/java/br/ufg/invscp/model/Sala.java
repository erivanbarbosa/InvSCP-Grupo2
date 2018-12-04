package br.ufg.invscp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sala")
public class Sala extends EntidadeAbstrata {
	private String numero;
	private int tipo;
	
	@ManyToOne
	@JoinColumn(name = "id_sala", referencedColumnName = "id")
	private Predio predio;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento", referencedColumnName = "id")
	private Departamento departamento;
	
	@OneToMany(mappedBy = "bemPatrimonial")
	private List<BemPatrimonial> bensPatrimoniais;
	
	
	public Sala(String numero, int tipo, Predio predio) {
		this.numero = numero;
		this.tipo = tipo;
		this.predio = predio;
	}

	public Sala(String numero, int tipo, Predio predio, Departamento departamento ) {
		this.numero = numero;
		this.tipo = tipo;
		this.predio = predio;
		this.departamento = departamento;
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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}
