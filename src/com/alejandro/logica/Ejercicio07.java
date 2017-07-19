package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio07 {
	
	Scanner entrada = new Scanner(System.in);
		
	///Se multiplica la cantidad por el 20 o por 30, segun el caso y se divide por 100. 
	//En definitiva no es otra cosa que una "regla de tres" simple.
	
	//los descuentos son 10%,20%,40%
	
	int num_escritorios;
	int valor_total = 650000;
	
	int calculo;
	
	int descuento = 0;

	public Ejercicio07(){
		
		System.out.println("Ingrese numero de Escritorios: ");
		num_escritorios = entrada.nextInt();

		calculo = num_escritorios * valor_total;
	    
		if(num_escritorios < 5){
			descuento = (int) (calculo * 0.1);
		}
		else if(num_escritorios >=5 && num_escritorios <10){
			descuento = (int) (calculo * 0.2);
		}
		else{
			descuento = (int) (calculo * 0.4);
		}
		
		System.out.println("El valor a pagar es: "+ (calculo-descuento));

	}
	
}
