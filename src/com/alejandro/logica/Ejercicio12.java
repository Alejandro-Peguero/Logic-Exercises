package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio12 {

      Scanner entrada = new Scanner(System.in);
      
      public Ejercicio12(){
    	  
    	   System.out.println("Cuantos numeros desea?.........:");
    	   int numero = entrada.nextInt();
    	   
    	   //contador
    	  // int contador = 0;
    	   
    	   //acumulador
    	   int suma = 0;
    	   
    	   for(int contador = 0; contador <= numero; contador ++){
    		   suma = suma + contador;
    		   System.out.print(contador +"\t");  		   
    	   }
    	   
    	   
    	  /* while (contador < numero) {
    		   contador ++;
    		   suma = suma +contador;
			System.out.print(contador +"\t");
		}*/
    	   
    	   System.out.println("\nLa sumatoria es: " + suma);
    	   System.out.println("\nEl promedio es " + (suma / numero));
      }
	
}
