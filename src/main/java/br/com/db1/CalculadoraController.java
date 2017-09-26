package br.com.db1;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraController {
	private Integer primeiroValor;
	private Integer segundoValor;
	private Integer resultado;

	public Integer getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Integer primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Integer getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Integer segundoValor) {
		this.segundoValor = segundoValor;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	public Integer somar() {
		resultado = primeiroValor + segundoValor;
		return resultado;
	}

	public Integer subtrair() {
		resultado = primeiroValor - segundoValor;
		return resultado;
	}

	public Integer multiplicar() {
		resultado = primeiroValor * segundoValor;
		return resultado;
	}

	public Integer dividir() {
		resultado = primeiroValor / segundoValor;
		return resultado;
	}
}