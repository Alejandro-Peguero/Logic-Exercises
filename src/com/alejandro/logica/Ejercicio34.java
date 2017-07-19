package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio34 {

	int n;
	public Ejercicio34() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese el Orden de la Matriz: ");
		n = entrada.nextInt();
        
		//proceso
		int m[][] = new int[n][n];
		
		//llenamos y mostramos la matriz completa
		System.out.println("MATRIZ COMPLETA");
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = (i * 2) + j;
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		//declarar e inicializar la matriz auxiliar
		String a[][] = new String[n][n];
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = "";
			}
		}
		
		 //llenamos la matriz auxiliar con la forma de un reloj de arena
		int x = (n/2) + 1;
		for(int i = 0; i < x; i++) {
			for(int j = i; j < n - i; j++) {
				a[i][j] = "" + m[i][j];
				a[n - i - 1][j] = "" + m[n - i - 1][j];
			}
		}
		System.out.println("RELOJ ARENA");
		//mostramos como quedo el reloj de arena
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " \t");
			}
			System.out.println();
		}
		
	}
}