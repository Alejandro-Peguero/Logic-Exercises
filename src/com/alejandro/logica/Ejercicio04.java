package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio04 {
	
    int a,b;

	
	public Ejercicio04(){

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Ingrese un numero: ");
		 a = entrada.nextInt();
		 
		 System.out.println("Ingrese un numero: ");
		 b = entrada.nextInt();
		 
		 if(a % b ==0){
			 System.out.println("El numero "+b+" es multiplo de " +a);
		 }else{
			 System.out.println("El numero "+b+" no es multiplo de " +a);
		 }

	}

}
