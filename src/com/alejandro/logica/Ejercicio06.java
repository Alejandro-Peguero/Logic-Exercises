package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio06 {
	
	Scanner entrada = new Scanner(System.in);
	
	String nombre;
	int horas_trabajadas;
	int valor_hora;
	int sal_min_mensual;
	
	int salario_mensual;
	
	public Ejercicio06(){
		
		System.out.println("Ingrese Nombre: ");
		//nombre = entrada.next();
		nombre = entrada.nextLine();
		
		System.out.println("Ingrese numero de horas trabajadas: ");
		horas_trabajadas = entrada.nextInt();
		
		System.out.println("Ingrese valor hora");
		valor_hora = entrada.nextInt();
		
		System.out.println("Ingrese su salario minimo mensual: ");
		sal_min_mensual = entrada.nextInt();
		
		salario_mensual = horas_trabajadas * valor_hora;
		
		if(sal_min_mensual < salario_mensual){
			System.out.println("Nombre: "+nombre);
			System.out.println("Nombre: "+salario_mensual);
		}else{
			System.out.println("Nombre: "+nombre);	
		}

	}
	

}
