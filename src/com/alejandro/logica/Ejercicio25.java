package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio25 {
	
	int posiciones;
	
	public Ejercicio25(){

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Cuantas posiciones desea? : ");
		 posiciones = entrada.nextInt();
		 
		 int [] vector = new int[posiciones];
		 int sumatoria = 0;
		 int promedio = 0;
		 
		 for (int i = 0; i < posiciones; i++){
			 vector[i] =(i+1) * i;
			 sumatoria = sumatoria + vector[i];
			 promedio =  sumatoria / posiciones;
		 }
		 System.out.println("La Sumatoria es: "+sumatoria);
		 System.out.println("El Promedio es: "+promedio);
	}	
}