package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio35 {

	int n;
	public Ejercicio35() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese numero a descomponer: ");
		n = entrada.nextInt();
			
		//proceso
		int mat[][] = new int [50][2];
		int tope = 0;
		
		mat[tope][0] = n;
		int i;
		
		while(!esPrimo(mat[tope][0])) {
			for(i = 2; i < mat[tope][0]; i++) {
				if(mat[tope][0] % i ==0) {
					break;
				}
			}
			mat[tope][1] = i;
			mat[tope +1][0] = mat[tope][0] / i;
			tope++;
		}	
		mat[tope][1] = mat[tope][0]; 
		/*
		//mostramos los resultados sencillo
		String fac = n + " = ";
		 for(i = 0; i <= tope; i++) fac += mat[i][1] + " x ";
		 
		 //quitamos el ultimo x
		 fac = fac.substring(0, fac.length() -3);
		 
		 System.out.println(fac);
		*/
		
		//mostramos resultados mejorado!
		i=0;
		String fac = n + " = ";
		int aux, con = 0;
		while(i <= tope) {
			aux = mat[i][1];
			con = 0;
			while(i <= tope && aux == mat[i][1]) {
				con++;
				i++;
			}
			if(con > 1) {
				fac = fac + aux + "^" + con + " x ";
			}else {
				fac = fac + aux + " x ";
			}
		}
		 //quitamos el ultimo x
		 fac = fac.substring(0, fac.length() -3);
		 
		 System.out.println(fac);
	}
	public static boolean esPrimo(int n){
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}