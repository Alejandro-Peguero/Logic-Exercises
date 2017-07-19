package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio31 {

	public Ejercicio31() {

		Scanner entrada = new Scanner(System.in);

		// pido datos de entrada
		System.out.println("Ingrese Orden de la matriz");
		int n = entrada.nextInt();

		// proceso
		int mat[][] = new int[n][n];
		
		//llenar la matriz
        for(int i = 0; i < n; i++){
        	     for(int j = 0; j < n; j++) {
        	    	      mat[i][j] = i + j;
        	    	      System.out.print(mat[i][j] + "\t");
        	     }
        	     System.out.println();
        }
        //imprime la triangular inferior
        for(int i = 0; i < n; i++) {
        	      for(int j = 0; j <=  i; j++) {
        	    	  System.out.print(mat[i][j] + "\t");
        	    }
        	      System.out.println();
        }
	}
}