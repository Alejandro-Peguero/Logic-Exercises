package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio02 {
	
	int numero1, numero2, numero3;
	
	
	public Ejercicio02(){

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Ingrese el primer numero: ");
		 numero1 = entrada.nextInt();
		 
		 System.out.println("Ingrese el segundo numero: ");
		 numero2 = entrada.nextInt();
		 
		 System.out.println("Ingrese el tercer numero: ");
		 numero3 = entrada.nextInt();
		 
		 if(numero1 > numero2 && (numero1 > numero3)){
			 System.out.println("El Numero Mayor es: " + numero1);	 
		 }
		 else if(numero2 > numero1 && (numero2 > numero3)){
			 System.out.println("El Numero Mayor es: " + numero2);	 
		 }else{
			 System.out.println("El Numero Mayor es: " + numero3);	 
		 }
		 
		 
		 

	}

}
