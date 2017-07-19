package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio33 {

	int m,n,p;

	public Ejercicio33() {

		Scanner entrada = new Scanner(System.in);

		System.out.println( "Ingrese El Valor de M : ");
		m = entrada.nextInt();
		System.out.println( "Ingrese El Valor de N : ");
		n = entrada.nextInt();
		System.out.println( "Ingrese El Valor de P : ");
		p = entrada.nextInt();
		
		//declaramos las matrices
		int a[][] = new int [m][n];
		int b[][] = new int [n][p];
		int c[][] = new int [m][p];
		
		//llenamos la matriz A
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = (i + 1) * j;
			}
		}
		//llenamos la matriz B
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < p; j++) {
				b[i][j] = (j + 1) * i;
			}
		}
		//llenamos la matriz C con la multiplicacion de las matrices A y B 
		 for(int i = 0; i < m; i++) {
			 for(int j = 0; j < p; j++) {
				 for(int k = 0; k < n; k++) {
					 c[i][j] += a[i][k] * b[k][j];
				 }
			 }
		 }
		//mostramos las matrices 
		System.out.println("*******A******");
		show(a, m, n);
		System.out.println("*******B******");
		show(b, n, p);
		System.out.println("*******B******");
		show(c, m, p);
		
	}
	public static void show(int m[][], int f, int c) {
		for(int i = 0; i < f; i++) {
			for(int j =0; j < c; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}