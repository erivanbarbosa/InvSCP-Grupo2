package br.ufg.invscp.model.dto;

import java.util.List;

public class PredioDTO {
	private Long localizacaoId;
	private List<Long> salasId;

	public Long getLocalizacaoId() {
		return localizacaoId;
	}

	public void setLocalizacaoId(Long localizacaoId) {
		this.localizacaoId = localizacaoId;
	}

	public List<Long> getSalasId() {
		return salasId;
	}

	public void setSalasId(List<Long> salasId) {
		this.salasId = salasId;
	}
	
	
}
