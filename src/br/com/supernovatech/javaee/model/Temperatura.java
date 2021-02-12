package br.com.supernovatech.javaee.model;

public class Temperatura {

	private Double celsius, fahrenheit;
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getCelsius() {
		return celsius;
	}

	public void setCelsius(Double celsius) {
		this.celsius = celsius;
	}

	public Double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(Double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
}
