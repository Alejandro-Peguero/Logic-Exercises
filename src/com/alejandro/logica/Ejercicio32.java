package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio32 {

	Ejercicio32() {
		Scanner sc = new Scanner(System.in);

		// pido dato de entrada
		System.out.println("Ingrese el tamano del rombo: ");
		int n = sc.nextInt();
       
		//proceso
		char r[][] = new char[n][n];
		
		//llenamos los rombos con espacios en blanco
		 for(int i = 0; i < n ; i++) {
			 for(int j = 0; j < n; j++) {
				 r[i][j] = ' ';
			 }
		 }
		 
		 //llenamos el rombo
		 int m = n/2;
		 for(int i = 0; i <= m; i++) {
			 r[i][m - i] = '#';
			 r[i][m + i] = '#';
			 r[n -i -1][m -i] = '#';
			 r[n -i -1][m -i] = '#';
			 r[n -i -1][m +i] = '#';
		 } 
		 //mostramos el rombo
		 for(int i = 0; i < n ; i++) {
			 for(int j = 0; j < n; j++) {
				 System.out.print(r[i][j]);
			 }
			 System.out.println( );
		 }
	}
}