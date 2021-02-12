package br.com.supernovatech.javaee.bean;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ConverterTemperatureBean
 */
@Stateless
public class ConverterTemperatureBean implements ConverterTemperatureBeanRemote {

    public Double converterCelsius(Double fahrenheit) {
    	return (fahrenheit - 32.0) / 1.8;
    }
    
    public Double converterFahrenheit(Double celsius) {
    	return (celsius * 1.8) + 32.0;
    }

}
