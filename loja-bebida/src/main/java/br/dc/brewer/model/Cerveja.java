package br.dc.brewer.model;

import javax.validation.constraints.NotBlank;

public class Cerveja {

	@NotBlank
	private String SKU;
	@NotBlank
	private String nome;

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
