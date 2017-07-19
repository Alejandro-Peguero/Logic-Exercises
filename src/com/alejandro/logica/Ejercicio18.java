package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio18 {
	
	/*****Serie o sucesion de fibonacci Modificada*****/
	
	int numero;
	public Ejercicio18(){

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Cuantos terminos desea?: ");
		 numero = entrada.nextInt();
		 
		 int a = 0; 
		 int b = 1; 
		 int c = 2; 
		 int d;
		 int sumatoria = 3;
		 
		 System.out.print(a + "\t" + b + "\t" + c +"\t");
        
		 for(int i = 4; i <= numero; i++) {
			 d = a + b + c; 
			 System.out.print(d + "\t");
			 sumatoria = sumatoria + d;
			 a = b;
			 b = c;
			 c = d;
			 
		 }
		 System.out.println("\nLa sumatoria es: " + sumatoria);
	}
}
