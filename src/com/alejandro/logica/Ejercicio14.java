package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio14 {

	/*****************************SERIE DE TAYLOR***********************/
	
	 Scanner entrada = new Scanner(System.in);
     int numero;
     int valorX;
	
	public Ejercicio14(){
	   	   System.out.println("Cuantos terminos desea?...:");
	   	   numero = entrada.nextInt(); 
	   	   System.out.println("Ingrese el valor de X:....:");
	   	   valorX = entrada.nextInt(); 
	   	   
	   	   //calculos
	   	   double suma=0,termino;
	   	   for(int i=0; i< numero; i++){
	   		  termino = Math.pow(valorX, i) / factorial(i);
	   		  suma = suma +termino;
	   	   }
	   	   
	       //mostramos resultados  	
	   	   System.out.printf("f(%d)=%f\n", valorX, suma);
		 
	}
	 public static double factorial( int n){
	       double factorial = 1;
	       
	      for(int i =2; i<=n; i++){
	    	      factorial = factorial * i;
	      }
	 return factorial;
}
}
