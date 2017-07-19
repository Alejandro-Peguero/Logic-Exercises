package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio19 {

	int numero;
	Scanner entrada = new Scanner(System.in);

	Ejercicio19() {
		System.out.println("Ingrese un Numero; ");
		numero = entrada.nextInt();

		if (esPrimo(numero) == true) {
			System.out.println("El numero " + numero + " es primo.");
		} else {
			System.out.println("El numero " + numero + " no es primo.");
		}
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
