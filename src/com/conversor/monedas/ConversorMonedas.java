package com.conversor.monedas;


import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	
	 
	
	public static void menuOpcionesDeMonedas(Double cantidadAConvertir) {
		Object[] opciones = {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De pesos a Yen", "De pesos a Won Coreano" 
				, "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"};
		
		Object seleccion = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dirnero:", 
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
		
		
		if (seleccion != null) {
	
			switch (seleccion.toString()) {
				case "De Pesos a Dólar": 
					conversorDeMonedaAMoneda(cantidadAConvertir, 0.00025, 4004.50, "Dolares");
					break;
				case "De Pesos a Euro":
					conversorDeMonedaAMoneda(cantidadAConvertir, 0.00023, 4399.43, "Euros");
					break;
				case "De Pesos a Libras": 
					conversorDeMonedaAMoneda(cantidadAConvertir, 0.00020, 5120.33, "Libras");
					break;
				case "De pesos a Yen": 
					conversorDeMonedaAMoneda(cantidadAConvertir, 0.036, 27.96, "Yenes");
					break;
				case "De pesos a Won Coreano":
					conversorDeMonedaAMoneda(cantidadAConvertir, 0.32, 3.11, "Wones");
					break;
				case "De Dólar a Pesos":
					conversorDeMonedaAMoneda(cantidadAConvertir, 4399.43, 0.00025, "Pesos");
					break;
				case "De Euro a Pesos":
					conversorDeMonedaAMoneda(cantidadAConvertir, 4399.43, 0.00023, "Pesos");
					break;
				case "De Libras a Pesos":
					conversorDeMonedaAMoneda(cantidadAConvertir, 5120.33, 0.00020, "Pesos");
					break;
				case "De Yen a Pesos":
					conversorDeMonedaAMoneda(cantidadAConvertir, 27.96, 0.036, "Pesos");
					break;
				case "De Won Coreano a Pesos":
					conversorDeMonedaAMoneda(cantidadAConvertir, 3.11, 0.32, "Pesos");
					break;
			}
		}
	}

	public static void conversorDeMonedaAMoneda(Double cantidadAConvertir, Double valorMonedaOrigen, Double valorMonedaDestino, String nombreMoneda) {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		if(valorMonedaDestino > valorMonedaOrigen) {
			Double valorDestino = cantidadAConvertir / valorMonedaDestino; 
			JOptionPane.showMessageDialog(null, numberFormat.format(valorDestino) + " " + nombreMoneda, "Salida", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Double valorDestino = cantidadAConvertir * valorMonedaOrigen;
			JOptionPane.showMessageDialog(null, numberFormat.format(valorDestino) + " " + nombreMoneda, "Salida", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
