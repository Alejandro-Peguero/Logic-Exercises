package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio01 {
	
	int numero;

	
	public Ejercicio01(){

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Ingrese un numero: ");
		 numero = entrada.nextInt();
		 
		 if(numero %2==0){
			 System.out.println(numero +" Es par");
		 }else{
			 System.out.println(numero +" Es impar");
			 
		 }

	}
	
	/*	public static double calcularFactorial(int numero){
		
		int factorial = 1;
		
	    while(numero !=0){
	
	    	   factorial = factorial * numero;
	    	   numero--;
	    	
	    }
		return factorial;	
	}*/
	
}
