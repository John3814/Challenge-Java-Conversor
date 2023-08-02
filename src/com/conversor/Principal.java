package com.conversor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import com.conversor.monedas.ConversorMonedas;
import com.conversor.temperatura.ConversorTemperatura;

public class Principal {

	public static void main(String[] args) {
		boolean bandera = true;
		do {
			bandera = leerOpcionMenuPrincipal();
			if (bandera == false) bandera = confirmarContinuacion();
		} while (bandera);
		JOptionPane.showMessageDialog(null, "Programa terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	private static boolean confirmarContinuacion() {
		Integer opcion = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");
		if (opcion != 0) {
			return true;
		} 
		return false;
	}
		

	public static boolean leerOpcionMenuPrincipal() {
		Object[] opciones = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", 
				"Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
		if (seleccion != null){		
			switch (seleccion.toString()) {
				case "Conversor de Moneda": 
					Double cantidad = leerValor("Ingresa la cantidad de dinero que deseas convertir:");
					if(cantidad != null) {
						ConversorMonedas.menuOpcionesDeMonedas(cantidad);
					}
					break;
				case "Conversor de Temperatura":
					Double valor = leerValor("");
					if(valor != null) {
						ConversorTemperatura.menuOpcionesDeTemperaturas(valor);
					}
					break;
			}
			return true;
		}
		return false;
	}
	

	private static Double leerValor(String mensaje) {
		String entrada = JOptionPane.showInputDialog(null, 
				mensaje, "Input", JOptionPane.QUESTION_MESSAGE);
		if(entrada != null) {
			entrada = entrada.replace(".", "");
			entrada = entrada.replace(",", ".");
			if(validarEntrada(entrada)) {
				return Double.parseDouble(entrada);
			}else {
				JOptionPane.showMessageDialog(null, "Valor no válido",
						"Error", JOptionPane.INFORMATION_MESSAGE);
				return leerValor(mensaje);
			}
		}
		return null;
	}

	
	private static boolean validarEntrada(String entrada) {
		String patronNumerico = "^[0-9]+(\\.[0-9]+)?$";
		Pattern pattern = Pattern.compile(patronNumerico);
		Matcher matcher = pattern.matcher(entrada);
		return matcher.matches();
	}

	
	

}
