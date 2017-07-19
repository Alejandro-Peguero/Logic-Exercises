package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio27 {
	
	String frase;

	
	public Ejercicio27(){
		
		 Scanner entrada = new Scanner(System.in);

		//pido datos de entrada
		 System.out.println("Ingrese la frase (sin tildes) : ");
		 frase = entrada.nextLine();
		 
		 //proceso
	     if(esPalindroma(frase)) {
			 System.out.println("La Frase SI es palindroma");
	     }else {
	    	 System.out.println("La Frase NO es palindroma");
	     }

	}
	public static boolean esPalindroma(String frase) {
		 //elimina de la frase los espacios en blanco y caracteres especiales 
		 String aux = "";
		 int n = frase.length();
		 
		 for(int i=0; i<n; i++) {
			 if(!(frase.substring(i, i+1).equals(" ") 
					 || frase.substring(i, i+1).equals(",") 
					 || frase.substring(i, i+1).equals("¿") 
					 || frase.substring(i, i+1).equals("?") 
					 || frase.substring(i, i+1).equals("."))) {
				 aux = aux + frase.substring(i, i + 1);
			 }
		 }
		 //comparamos las posiciones de la frase
		 n = aux.length();
		 for(int i=0; i<n/2; i++) {
			 if(!aux.substring(i, i+1).equals(aux.substring(n - i - 1, n-i))) {
				 return false;
			 }
		 }
		 return true;
	}
}