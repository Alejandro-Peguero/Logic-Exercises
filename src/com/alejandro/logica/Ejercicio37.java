package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio37 {

	public Ejercicio37(){

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Ingrese ubicación de los caballos: ");
		 String cab = entrada.next();
		 
		 //proceso
		 
		 
		 //ubicamos los caballos en el tablero y las posiciones de los mismos
		 int tab[][] = new int[8][8];
		 int pos[][] = new int[64][2];
		 int tope = 0;
		 int n = cab.length();
		 int i = 0;
		 
		 while(i < n) {
			 char col = cab.charAt(i);
			 i++;
			 char fil = cab.charAt(i);
			 i++;
			 i++;
			 tab[ef(fil)][ec(col)] = 1;
			 pos[tope][0] = ef(fil);
			 pos[tope][1] = ec(col);
			 tope++;
		 }	 
		 
		 //mostramos como quedo el tablero
		 //show(tab); 
		 
		 //Analizamos que caballos estan en conflicto
		 int fil, col;
		 for(i =0;i < tope; i++) {
			 System.out.print("Analizando Caballo en " + ecInv(pos[i][1]) + efInv(pos[i][0]) + " => ");
			 
			 //Analizamos movimientos del caballo
			 
			 //UL
			   fil = pos[i][0] -2;
			   col = pos[i][1] -1;
			 if(fil >=0 && fil <= 7 && col >= 0 && col <= 7){
				 if(tab[fil][col] == 1){
					 System.out.print("Conflicto con " + ecInv(col) + efInv(fil) + "\t");
				 }
			 }
			 //UR
			   fil = pos[i][0] -2;
			   col = pos[i][1] +1;
			 if(fil >=0 && fil <= 7 && col >= 0 && col <= 7){
				 if(tab[fil][col] == 1){
					 System.out.print("Conflicto con " + ecInv(col) + efInv(fil) + "\t");
				 }
			 }
			 //LU
			   fil = pos[i][0] -1;
			   col = pos[i][1] -2;
			 if(fil >=0 && fil <= 7 && col >= 0 && col <= 7){
				 if(tab[fil][col] == 1){
					 System.out.print("Conflicto con " + ecInv(col) + efInv(fil) + "\t");
				 }
			 }
			 //LD
			   fil = pos[i][0] +1;
			   col = pos[i][1] -2;
			 if(fil >=0 && fil <= 7 && col >= 0 && col <= 7){
				 if(tab[fil][col] == 1){
					 System.out.print("Conflicto con " + ecInv(col) + efInv(fil) + "\t");
				 }
			 }
			 //RU
			   fil = pos[i][0] -1;
			   col = pos[i][1] +2;
			 if(fil >=0 && fil <= 7 && col >= 0 && col <= 7){
				 if(tab[fil][col] == 1){
					 System.out.print("Conflicto con " + ecInv(col) + efInv(fil) + "\t");
				 }
			 }
			 //RD
			   fil = pos[i][0] +1;
			   col = pos[i][1] +2;
			 if(fil >=0 && fil <= 7 && col >= 0 && col <= 7){
				 if(tab[fil][col] == 1){
					 System.out.print("Conflicto con " + ecInv(col) + efInv(fil) + "\t");
				 }
			 }
			 //DL
			   fil = pos[i][0] +2;
			   col = pos[i][1] -1;
			 if(fil >=0 && fil <= 7 && col >= 0 && col <= 7){
				 if(tab[fil][col] == 1){
					 System.out.print("Conflicto con " + ecInv(col) + efInv(fil) + "\t");
				 }
			 }
			 //DR
			   fil = pos[i][0] +2;
			   col = pos[i][1] +1;
			 if(fil >=0 && fil <= 7 && col >= 0 && col <= 7){
				 if(tab[fil][col] == 1){
					 System.out.print("Conflicto con " + ecInv(col) + efInv(fil) + "\t");
				 }
			 }
			 System.out.println();
		 }
	}	

	public static void show(int tab[][]) {
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
	public static char efInv(int f) {
		switch (f) {
		case 0: return '8';
		case 7: return '7';
		case 6: return '6';
		case 5: return '5';
		case 4: return '4';
		case 3: return '3';
		case 2: return '2';
		default:return '1';
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
	public static char ecInv(int f) {
		switch (f) {
		case 0: return 'A';
		case 1: return 'B';
		case 2: return 'C';
		case 3: return 'D';
		case 4: return 'E';
		case 5: return 'F';
		case 6: return 'G';
		default:return 'H';
		}
	}
}