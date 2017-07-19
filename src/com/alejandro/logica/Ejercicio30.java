package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio30 {

	public Ejercicio30() {

		Scanner entrada = new Scanner(System.in);

		// pido datos de entrada
		System.out.println("Ingrese Orden de la matriz");
		int n = entrada.nextInt();

		// proceso
		int mat[][] = new int[n][n];
		int sum = 0;
		int mayor = -999999;
		int menor = 999999;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = (i + 1) - j;
				System.out.print(mat[i][j] + "\t");
				sum += mat[i][j];
				if (mat[i][j] > mayor) {
					mayor = mat[i][j];
				}
				if (mat[i][j] < menor) {
					menor = mat[i][j];
				}

			}
			System.out.println();
		}
		System.out.println("La Sumatoria es: " + sum);
		System.out.println("El Valor Maximo es: " + mayor);
		System.out.println("El Valor Minimo es: " + menor);
	}
}