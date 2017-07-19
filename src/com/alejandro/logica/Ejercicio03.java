package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio03 {
	
	int numero1, numero2, numero3;
	
	
	public Ejercicio03(){

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
		 else if(numero1 < numero2 && (numero1 < numero3)){
			 System.out.println("El Numero Menor es: " + numero1);	 
		 }else{
			 System.out.println("El Numero del Medio es: " + numero1);	 
		 }
		 
		 
		 if(numero2 > numero1 && (numero2 > numero3)){
			 System.out.println("El Numero Mayor es: " + numero2);	 
		 }
		 else if(numero2 < numero2 && (numero1 < numero3)){
			 System.out.println("El Numero Menor es: " + numero2);	 
		 }else{
			 System.out.println("El Numero del Medio es: " + numero2);	 
		 }
		 
		 
		 
		 if(numero3 > numero2 && (numero3 > numero1)){
			 System.out.println("El Numero Mayor es: " + numero3);	 
		 }
		 else if(numero3 < numero2 && (numero3 < numero1)){
			 System.out.println("El Numero Menor es: " + numero3);	 
		 }else{
			 System.out.println("El Numero del Medio es: " + numero3);	 
		 }
		 
		 

	}

}
