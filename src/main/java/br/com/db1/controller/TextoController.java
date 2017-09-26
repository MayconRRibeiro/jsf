package br.com.db1.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TextoController {
	private String texto;
	private Double numero;
	private Double numeroFormatado;
	private String cores;
	private Uf uf;
	private Sexo sexo;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	public Double getNumeroFormatado() {
		return numeroFormatado;
	}

	public void setNumeroFormatado(Double numeroFormatado) {
		this.numeroFormatado = numeroFormatado;
	}
	
	public void formatarNumero() {
		numeroFormatado = numero;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getCores() {
		return cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}

	public Uf getUf() {
		return uf;
	}

	public Uf[] getListaUf() {
		return uf.values();
	}

	public Sexo getSexo() {
		return sexo;
	}

	public Sexo[] getListaSexo() {
		return sexo.values();
	}

	public String apresentarTextoEmMinuscula() {
		return texto.toLowerCase();
	}

	public String apresentarTextoEmMaiuscula() {
		return texto.toUpperCase();
	}

}