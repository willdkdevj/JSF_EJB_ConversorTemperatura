package br.com.supernovatech.javaee.bean;

import javax.ejb.Remote;

@Remote
public interface ConverterTemperatureBeanRemote {

	public Double converterCelsius(Double fahrenheit);
	public Double converterFahrenheit(Double celsius);
}
