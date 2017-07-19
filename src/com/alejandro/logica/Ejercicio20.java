package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio20 {

	int numero;
	Scanner entrada = new Scanner(System.in);

	Ejercicio20() {
		System.out.println("Cuantos numeros primos desea?: ");
		numero = entrada.nextInt();
     
		//proceso 
		int conPrimo = 0;
		int i = 1;
		int sumatoria = 0;
		
		while(conPrimo < numero) {
			if (esPrimo(i)){
				System.out.print(i + " \t ");
				conPrimo++;
				sumatoria = sumatoria + i;
			}
			i++;
		}
		System.out.println("\nLa suma es: "+sumatoria);
		System.out.println("\nEl promedio es: "+(sumatoria/numero));
	}

	public static boolean esPrimo(int numero) {
		//for (int i = 2; i < numero; i++);
		//numero / 2 para rendimiento del ciclo for.
		for (int i = 2; i <= numero/2; i++) {
			if (numero % i == 0)
				return false;
		}
		return true;
	}
}
