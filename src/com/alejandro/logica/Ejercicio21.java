package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio21 {

	Scanner entrada = new Scanner(System.in);
	int numero;

	public Ejercicio21() {

		System.out.println("Cuantos terminos de precision desea? :");
		numero = entrada.nextInt();
     
		System.out.println("e = :" + e(numero));
		
	}
	
	public static double e(int n) {
		double sumatoria = 0; 
		double termino;
		
		for(int i=0; i<n; i++) {
			termino = 1 / factorial(i);
			sumatoria = sumatoria + termino;
		}
		return sumatoria;
	}

	public static double factorial(int n) {
		double factorial = 1;

		while (n != 0) {
			factorial = factorial * n;
			n--;
		}
		return factorial;
	}

}
