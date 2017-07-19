package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio16 {
	
	/*****************Ecuacion cuadratica***********/
	
	Scanner entrada = new Scanner(System.in);
	int a,b,c;
	
	Ejercicio16(){
		System.out.println("Ingrese el valor de a: ");
		a = entrada.nextInt();
		System.out.println("Ingrese el valor de b: ");
		b = entrada.nextInt();
		System.out.println("Ingrese el valor de c: ");
		c = entrada.nextInt();
		
     	//proceso
		double raiz = Math.sqrt(b * b -4 * a * c);
		double x1 = (-b + raiz) /(2 * a);
		double x2 = (-b - raiz) /(2 * a);
		
		//mostramos resultados
		System.out.printf("x1: %f\n", x1);
		System.out.printf("x2: %f\n", x2);
	}
}
