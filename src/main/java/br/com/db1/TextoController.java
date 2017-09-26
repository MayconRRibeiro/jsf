package br.com.db1;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TextoController {
	private String texto;
	private Integer numero;
	private String cores;
	
	private static Map<String, Object> corValue;
	static {
		corValue = new LinkedHashMap<String, Object>();
		corValue.put("Color1 - Red", "Red");
		corValue.put("Color2 - Green", "Green");
		corValue.put("Color3 - Blue", "Blue");
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String getCores() {
		return cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}

	public Map<String, Object> getRadioButton() {
		return corValue;
	}

	public String apresentarTextoEmMinuscula() {
		return texto.toLowerCase();
	}

	public String apresentarTextoEmMaiuscula() {
		return texto.toUpperCase();
	}

	public String formatarNumero() {

		return numero.toString();
	}

}