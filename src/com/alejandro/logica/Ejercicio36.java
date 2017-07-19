package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio36 {

	public Ejercicio36() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese ubicación de los frutos :");
		String fru = entrada.next();
		System.out.print("Ingrese posición inicial del caballo :");
		String cab = entrada.next();
		System.out.print("Ingrese los movimientos del caballo :");
		String mov = entrada.next();

		// proceso

		// ubicar los frutos en el tablero
		char tab[][] = new char[8][8];
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				tab[i][j] = ' ';
			}
		}
		
		int n = fru.length(), i = 0;
		char fil, col, ele;

		while (i < n) {
			col = fru.charAt(i);
			i++;
			fil = fru.charAt(i);
			i++;
			ele = fru.charAt(i);
			i++;
			i++;
			tab[ef(fil)][ec(col)] = ele;
		}

	    col = cab.charAt(0);
	    fil = cab.charAt(1);
	    int posFil = ef(fil);
	    int posCol = ec(col);
	    String cosecha = "";
	    
	    if(tab[posFil][posCol] != ' ') {
	    	cosecha = "" + tab[posFil][posCol];
	    }
	    
	    //recorremos todos los movimientos del caballo
	    n = mov.length();
	    i=0;
		while (i < n) {
			String movimiento = mov.substring(i, i + 2);
			switch (movimiento) {
			case "UL":
				posFil -= 2;
				posCol -= 1;
				break;
			case "UR":
				posFil -= 2;
				posCol += 1;
				break;
			case "LU":
				posFil -= 1;
				posCol -= 2;
				break;
			case "LD":
				posFil += 1;
				posCol -= 2;
				break;
			case "RU":
				posFil -= 1;
				posCol += 2;
				break;
			case "RD":
				posFil += 1;
				posCol += 2;
				break;
			case "DL":
				posFil += 2;
				posCol -= 1;
				break;
			default:
				posFil += 2;
				posCol += 1;
				break;
			}
			i += 3;
			if (tab[posFil][posCol] != ' ') {
				cosecha = cosecha + tab[posFil][posCol];
			}
		}
		
		  //mostramos resultados
		System.out.println("Los frutos recogidos son :" + cosecha);
		
	}

	public static void show( char tab[][]) {
		System.out.println("  0 1 2 3 4 5 6 7");
		for(int i = 0; i < 8; i++) {
			System.out.print(i + " ");
			for(int j = 0; j < 8; j++) {
				 System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int ef(char f) {
		switch (f) {
		case '8': return 0;
		case '7': return 1;
		case '6': return 2;
		case '5': return 3;
		case '4': return 4;
		case '3': return 5;
		case '2': return 6;
		default:return 7;
		}
	}
	public static int ec(char f) {
		switch (f) {
		case 'A': return 0;
		case 'B': return 1;
		case 'C': return 2;
		case 'D': return 3;
		case 'E': return 4;
		case 'F': return 5;
		case 'G': return 6;
		default:return 7;
		}
	}
}