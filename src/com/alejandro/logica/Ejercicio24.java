package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio24 {

	int posicion;

	public Ejercicio24() {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantas posiciones desea?: ");
		posicion = entrada.nextInt();

		int vector[] = new int[posicion];

		// llenamos el arreglo
		int sumatoria =0;
		double productoria =1;
		
		for (int i = 0; i < posicion; i++) {
			if (esPar(i)) {
				vector[i] = i + 7;
			} else {
				vector[i] = i - 1;
			}
			if (esPar(vector[i])){
				sumatoria = sumatoria + vector[i];
			}else {
				productoria = productoria * vector[i];
			}
			System.out.println("Vector[" + i + "]=" + vector[i]);
		}
		System.out.println("La Sumatoria es: " + sumatoria);
		System.out.println("La Productoria es: " + productoria);
	}

	public static boolean esPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
