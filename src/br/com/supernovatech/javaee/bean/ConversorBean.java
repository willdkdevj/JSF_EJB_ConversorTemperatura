package br.com.supernovatech.javaee.bean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.supernovatech.javaee.model.Temperatura;

@Named("conversor")
@RequestScoped
public class ConversorBean implements Serializable{

	private Temperatura temperatura = new Temperatura();

	@EJB
	private ConverterTemperatureBeanRemote conversor;
		
	public void conversorEmCelsius() {
		System.out.println("Chamou celsius = " + temperatura.getCelsius() + " " + temperatura.getFahrenheit() + temperatura.getTipo());
		temperatura.setCelsius(conversor.converterCelsius(temperatura.getFahrenheit()));
	}
	
	public void conversorEmFahrenheit() {
		System.out.println("Chamou fahrenheit = " + temperatura.getFahrenheit() + " " + temperatura.getCelsius() + temperatura.getTipo());
		temperatura.setFahrenheit(conversor.converterFahrenheit(temperatura.getCelsius()));
	}
	
	public Temperatura getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Temperatura temperatura) {
		this.temperatura = temperatura;
	}

	public String conversorTemperatura() {
		if (temperatura.getTipo().equals("C")) 
			conversorEmCelsius();
		else
			conversorEmFahrenheit();
		return null;
	}
}
