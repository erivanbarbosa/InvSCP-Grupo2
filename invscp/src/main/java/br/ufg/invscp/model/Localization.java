package br.ufg.invscp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "localization")
public class Localization extends EntidadeAbstrata {

	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@OneToMany(mappedBy="localizacao")
	private List<Predio> predios;

	
	public Localization() {
		super();
	}

	public Localization(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Predio> getPredios() {
		return predios;
	}

	public void setPredios(List<Predio> predios) {
		this.predios = predios;
	}

	@Override
	public String toString() {
		return "Localization [name=" + name + "]";
	}
	
	
}
