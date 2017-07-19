package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio26 {
	
	int n;
	
	public Ejercicio26(){

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Cuantas posiciones desea? : ");
		 n = entrada.nextInt();
		 //proceso
		 int [] vec = new int[n];
		 
		 //llenamos el arreglo
		 System.out.println("SIN ORDENAR::");
		 int conPar=0,conImp=0;
		 for (int i = 0; i < n; i++){
			 if(esPar(i)){
				 vec[i] = i * i +1;
			 }else {
				 vec[i] = 3 * (i +1);
			 }
			 if(esPar(vec[i])) {
				 conPar++;
			 }else {
				 conImp++;
			 } 
			 System.out.println("Vector[" + i + "]=" + vec[i]);
		 }
		 
		 //creamos arreglos auxiliares
		 int par[] = new int[conPar];
		 int imp[] = new int[conImp];
		 
		 //llenamos los arreglos auxiliares 
		 int k = 0, l = 0;
		 for (int i = 0; i < n; i++){
			 if(esPar(vec[i])) {
				 par[k] = vec[i];
				 k++;
			 }else {
				 //bug?
				 imp[l] = vec[i];
				 l++;
			 }
		 }
		 //Ordenamos el arreglo de pares descendentemente
		 int aux;
		 for(int i = 0; i < conPar - 1; i++ ) {
			 for(int j = i+1; j<conPar; j++ ) {
				 if(par[i] < par[j]) {
					 aux = par[i];
					 par[i] = par[j];
					 par[j] = aux;
				 }
			 } 
		 }
		 //Ordenamos el arreglo de impares ascendientemente
		 for(int i = 0; i < conImp - 1; i++ ) {
			 for(int j = i+1; j<conImp; j++ ) {
				 if(imp[i] > imp[j]) {
					 aux = imp[i];
					 imp[i] = imp[j];
					 imp[j] = aux;
				 }
			 }
		 }
		 //Colocar las posiciones en el arreglo original
		   for(int i = 0; i < conPar; i++) {
			   vec[i] = par[i];
		   }
		   for(int i = 0; i < conImp; i++) {
			   vec[i + conPar] = imp[i];
		   }
		 //mostramos el arreglo ordenado
		 System.out.println("ORDENADO::");
		 for (int i = 0; i < n; i++){ 
			 System.out.println("Vector[" + i + "]=" + vec[i]);
		 }
	}
	public static boolean esPar(int n){
		if(n % 2 == 0) {
			return true;
		}else {
			return false; 
		}
	}
}