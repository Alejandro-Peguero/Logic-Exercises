package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio17 {
	
	/*****Serie o sucesion de fibonacci*****/
	
	int numero;
	public Ejercicio17(){

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Cuantos terminos desea?: ");
		 numero = entrada.nextInt();
		 
		 int a = 0; 
		 int b = 1; 
		 int c; 
		 int sumatoria = 1;
		 
		 System.out.print(a + "\t" + b);
        
		 for(int i = 2; i <= numero; i++) {
			 c = a + b; 
			 System.out.print(c + "\t");
			 sumatoria = sumatoria + c;
			 a = b;
			 b = c;
			 
		 }
		 System.out.println("\nLa sumatoria es: " + sumatoria);
	}
}
