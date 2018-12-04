package br.ufg.invscp.model;

import java.util.List;

import javax.persistence.OneToMany;

public class Departamento extends EntidadeAbstrata {
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Sala> salas;
	
	private Usuario chefe;
}
