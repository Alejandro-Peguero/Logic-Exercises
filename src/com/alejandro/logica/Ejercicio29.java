package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio29 {
	
	Ejercicio29(){
		Scanner sc = new Scanner(System.in);
		
		//pedimos datos de entrada
		System.out.print("Ingrese el Puente: ");
		String puente = sc.nextLine();
		
		//proceso
		if(esValido(puente)) {
			System.out.println("VALIDO!");
		}else {
			System.out.println("INVALIDO!");
		}
		
		
	}

	
	public static boolean esValido(String puente) {
		int n = puente.length();
		
		//validemos que empieze y termine con una base
		if(!(puente.substring(0, 1).equals("*") && puente.substring(n - 1, n).equals("*"))) {
			return false;
		}
		
		//Validemos que el puente no tenga otros caracteres
		int conRef = 0;
		for(int i = 1; i < n - 1; i++) {
			String pieza = puente.substring(i, i+1);
			if(!(pieza.equals("=") || pieza.equals("+"))) {
				return false;
			}
			
			if(pieza.equals("=")) {
			   conRef++;
			}else {
				conRef = 0;
			}
			
			if(conRef == 4) {
				return false;
			}
			
		}
		
		//validar el resto de condiciones
	    conRef = 0;
		for(int i = 1; i < n / 2 ; i++){
			String pi = puente.substring(i, i+1);
			String pd = puente.substring(n - i - 1, n - i);
			
			if(!pi.equals(pd)) {
				return false;
			}
			
			if(pi.equals("+")) {
				conRef++;
			}else {
				conRef = 0;
			}
			if(conRef == 3) {
				return false;
			}	
		}
		return true;
	}
}