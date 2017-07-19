package com.alejandro.logica;
import java.util.Scanner;
public class Ejercicio05 {
	
   static int numero;

	public Ejercicio05(){

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Ingrese el ano:");
		 numero = entrada.nextInt();
		 
		 if(esBisiesto(numero)){
			 System.out.println("El Ano "+numero+" es biciesto"); 
		 }else{
			 System.out.println("El Ano "+numero+" no es biciesto");  
		 }
	}
	
	//funcion para saber si es bisiesto o no
	public static boolean esBisiesto(int ano){
		if(numero % 4==0){	
			if(numero % 100==0){			
				if(numero % 400==0){
					return true;				
				}else{
					return false;
				}			
			}else{
				return true;
			}
		}else {
			return false;
		}	
	}
}
