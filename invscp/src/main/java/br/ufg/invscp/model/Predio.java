package br.ufg.invscp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "predio")
public class Predio extends EntidadeAbstrata {

	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_localizacao", referencedColumnName = "id")
	private Localization localizacao;

	@OneToMany(mappedBy = "predio")
	private List<Sala> salas;

	public Predio(Localization localizacao, List<Sala> salas) {
		this.localizacao = localizacao;
		this.salas = salas;
	}

	public Predio() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Localization getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localization localizacao) {
		this.localizacao = localizacao;
	}

	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

}
