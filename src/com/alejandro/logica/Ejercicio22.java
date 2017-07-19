package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio22 {

	Scanner entrada = new Scanner(System.in);
	int numero;

	public Ejercicio22() {

		System.out.println("Cuantos terminos de precision desea? :");
		numero = entrada.nextInt();

		System.out.println("pi = :" + pi(numero));

	}

	public static double pi(int numero) {
		int denominador = 1;
		int signo = 1;
		double termino;
		double sumatoria = 0;

		for (int i = 1; i <= numero; i++) {
			termino = (double) 1 / denominador * signo;
			sumatoria = sumatoria + termino;
			denominador = denominador + 2;
			signo = signo * -1;
		}
		return sumatoria * 4;
	}
}
