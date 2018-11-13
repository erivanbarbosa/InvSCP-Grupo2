package br.ufg.invscp.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "predio")
public class Predio extends EntidadeAbstrata {

	@ManyToOne
	@JoinColumn(name="id_localizacao", referencedColumnName="id_localizacao")
	private Localization localizacao;
}
