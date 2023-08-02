package com.conversor.temperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	
	public static void menuOpcionesDeTemperaturas(Double valor) {
		Object[] opciones = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", 
				"De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"};
		
		Object seleccion = JOptionPane.showInputDialog(null, "Elije la escala de temeperatura a la que deseas convertir:", "Escalas",
				JOptionPane.PLAIN_MESSAGE , null, opciones, opciones[0]);
		
		if(seleccion != null) {
			switch (seleccion.toString()) {
				case "De Celsius a Fahrenheit":
					convertirDeCelsiusAFahrenheit(valor);
					break;
				case "De Celsius a Kelvin":
					convertirDeCelsiusAKelvin(valor);
					break;
				case "De Fahrenheit a Celsius":
					convertirDeFahrenheitACelsius(valor);
					break;
				case "De Fahrenheit a Kelvin":
					convertirDeFahrenheitAKelvin(valor);
					break;
				case "De Kelvin a Celsius":
					convertirDeKelvinACelsius(valor);
					break;
				case "De Kelvin a Fahrenheit":
					convertirDeKelvinAFahrenheit(valor);
					break;
			}
		}
		
	}
	

	public static void convertirDeCelsiusAFahrenheit(Double valorEnCelsius) {
		Double valorEnFahrenheit = (valorEnCelsius * (1.8)) + 32;
		JOptionPane.showMessageDialog(null, valorEnFahrenheit + " Fahrenheit", "Salida", JOptionPane.INFORMATION_MESSAGE);
	}
	

	public static void convertirDeCelsiusAKelvin(Double valorEnCelsius) {
		Double valorEnKelvin = valorEnCelsius + 273.15;
		JOptionPane.showMessageDialog(null, valorEnKelvin + " Kelvin", "Salida", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public static void convertirDeFahrenheitACelsius(Double valorEnFahrenheit) {
		Double valorEnCelsius = (valorEnFahrenheit - 32) / 1.8;
		JOptionPane.showMessageDialog(null, valorEnCelsius + " Celsius", "Salida", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public static void convertirDeFahrenheitAKelvin(Double valorEnFahrenheit) {
		Double valorEnKelvin = ((valorEnFahrenheit - 32)/1.8) + 273.15;
		JOptionPane.showMessageDialog(null, valorEnKelvin + " Kelvin", "Salida", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public static void convertirDeKelvinACelsius(Double valorEnKelvin) {
		Double valorEnCelsius = valorEnKelvin - 273.15;
		JOptionPane.showMessageDialog(null, valorEnCelsius + " Celsius", "Salida", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public static void convertirDeKelvinAFahrenheit(Double valorEnKelvin) {
		Double valorEnFahrenheit = 1.8 * (valorEnKelvin - 273.15) + 32;
		JOptionPane.showMessageDialog(null, valorEnFahrenheit + " Fahrenheit", "Salida", JOptionPane.INFORMATION_MESSAGE);
	}

}
