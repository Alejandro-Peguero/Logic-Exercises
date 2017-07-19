package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio08 {
	
	int creditos;
	int valorCredito;
	int estrato;
	
	
	  Ejercicio08(){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Numero de Creditos: ");
		creditos = entrada.nextInt();
		System.out.println("Valor Credito: ");
		valorCredito = entrada.nextInt();
		System.out.println("Estrato del Estudiante: ");
		estrato = entrada.nextInt();
		
		//calculos
		int matricula = calculoMatricula(creditos,valorCredito,estrato);
		int subsidio = subsidioTransporte(estrato);
		
		System.out.println("Coste de la matricula: "+matricula);
		System.out.println("Valor del Subsidio: "+subsidio);
	
	}
	  
	  
	  public static int calculoMatricula(int creditos, int valorCredito, int estrato){
		  int valorMatricula = 0;
		  
		  if(creditos <= 20){
			  valorMatricula = creditos * valorCredito;
		  }
		  else{
			  valorMatricula = 20 * valorCredito + (creditos -20) * valorCredito * 2;  
		  }
		  
		  int descuento =0;

		  switch(estrato){
		  case 1: descuento = (int) (valorMatricula * 0.8);break;
		  case 2: descuento = (int) (valorMatricula * 0.5);break;
		  case 3: descuento = (int) (valorMatricula * 0.3);break;
		  }
		  return valorMatricula-descuento;
		  
	  }
	  
	  
	 public static int subsidioTransporte(int estrato){
		 int subsidio = 0;
		 
		 switch(estrato){
		  case 1: subsidio = 200000; break;
		  case 2: subsidio = 100000; break;
		 }	 
		 return subsidio;
	 } 

}
