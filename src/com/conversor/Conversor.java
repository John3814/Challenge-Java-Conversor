package com.conversor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		
		boolean bandera = false;
		
		do {
			String opcion = menuPrincipal();
			switch (opcion) {
				case "Conversor de Moneda": 
					Double valor = leerValor();
					break;
				case "Conversor de Temperatura":
					break;
				case "Salir":
					bandera = true;
					break;
			}
		} while (!bandera);
		
	}
	


	private static Double leerValor() {
		String entrada = JOptionPane.showInputDialog(null, 
				"Ingresa la cantidad de dinero que deseas convertir:", "Input", JOptionPane.QUESTION_MESSAGE);
		if(entrada != null) {
			entrada = entrada.replace(".", "");
			entrada = entrada.replace(",", ".");
			if(validarEntrada(entrada)) {
				return Double.parseDouble(entrada);
			}else {
				JOptionPane.showMessageDialog(null, "Valor no válido",
						"Error", JOptionPane.INFORMATION_MESSAGE);
				return leerValor();
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

	
	public static String menuPrincipal() {
		Object[] opciones = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", 
				"Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
		if(seleccion != null){		
			return seleccion.toString();
		}
		return "Salir";
	}

}
