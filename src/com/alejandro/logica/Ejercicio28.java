package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio28 {

	public Ejercicio28() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese La Viga: ");
		String viga = entrada.nextLine();

		// proceso
		if (esValida(viga)) {
            if (soportaPeso(viga)) {
            	System.out.println("La Viga Soporta el peso!");
            }else {
            	System.out.println("La Viga No! Soporta el peso");
            }
		} else {
			System.out.println("La Viga esta mal construida ");
		}

	}

	public static boolean esValida(String viga) {
		// analisamos si tiene una base valida
		String base = viga.substring(0, 1);
		if (!(viga.equalsIgnoreCase("#") || viga.equalsIgnoreCase("%") || viga.equalsIgnoreCase("&"))) {
			return false;
		}

		// analisamos que no tenga otros caracteres y que no tenga mas de dos
		// conexiones seguidas
		int n = viga.length();
		int conCon = 0;
		for (int i = 1; i < n; i++) {
			String pieza = viga.substring(i, i + 1);
			if (!(pieza.equalsIgnoreCase("=") || pieza.equalsIgnoreCase("*"))) {
				return false;
			}
			if (pieza.equalsIgnoreCase("*")) {
				conCon++;
			} else {
				conCon = 0;
			}
			if (conCon == 2) {
				return false;
			}
		}
		return true;
	}

	public static boolean soportaPeso(String viga) {
		// obtenemos la base
		String base = viga.substring(0, 1);

		// Calcular el peso de la viga
		int n = viga.length();
		int pesoTotal = 0;
		int pesoSegmento = 0;
		for (int i = 1; i < n; i++) {
			String pieza = viga.substring(i, i + 1);
              if(pieza.equalsIgnoreCase("=")){
            	  pesoSegmento++;
              }else {
            	  pesoTotal += pesoSegmento * 3;
            	  pesoSegmento = 0;
              }
		}
		pesoTotal += pesoSegmento;
		
		int pesoBase = 0;
		
		switch(base) {
		case "%": pesoBase = 10; break;
		case "&": pesoBase = 30; break;
		case "#": pesoBase = 90; break;
		}
		
		return pesoBase >= pesoTotal;
	}
}