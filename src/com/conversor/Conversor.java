package com.conversor;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		
		boolean bandera = false;
		
		do {
			String opcion = menuPrincipal();
			switch (opcion) {
				case "Conversor de Moneda": 
					break;
				case "Conversor de Temperatura":
					break;
				case "Salir":
					bandera = true;
					break;
			}
		} while (!bandera);
		
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
