package com.alejandro.logica;
import java.util.Scanner;

public class Ejercicio13 {
	
	 Scanner entrada = new Scanner(System.in);
     int numero;
     
     public Ejercicio13(){
   	  
   	   System.out.println("Ingrese numero a calcular Factorial......:");
   	   numero = entrada.nextInt(); 
   	   
   	   System.out.printf("El factorial de %d  es %.0f\n",numero, factorial(numero) ); 
   	   //System.out.println("factorial es " + factorial(numero));

     }

     public static double factorial( int n){
    	       double factorial = 1;
   	       
    	      for(int i =2; i<=n; i++){
    	    	      factorial = factorial * i;
    	      }
    	 return factorial;
     }
     
     public static double factorial2(int n){
    	     double factorial =1;
  
    	     while(n!=0){
    	    	 factorial=factorial*n;
    	    	  n--;
    	  }
    	 return factorial;
   }

}
