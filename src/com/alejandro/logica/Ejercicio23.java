package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio23 {
	
	int ano;
    Scanner entrada = new Scanner(System.in);
	
	public Ejercicio23(){
           System.out.println("Ingrese el ano: ");
           ano = entrada.nextInt();
           
           //proceso
          for(int i = 1; i<=12;i++) {
        	      System.out.println("\nMes: " + i );
        	      System.out.println("Dom\tLun\tMar\tMier\tJue\tVier\tSab");
        	      int dias = diasMes(ano, i);
        	      
              /*Calculamos espacios para que el dia del mes comience en el 
               * dia correcto de la semana.*/
        	      int z = zeller(ano, i);
        	      int contDia = 0;
        	        for(int k =0; k < z; k++) {
        	        	     contDia++;
        	        	     System.out.print("\t");
        	        }
        	        
        	      //imprimimos los dias del mes.
        	      //int contDia = 0;
        	         for(int j = 1; j <=dias; j++) {
        	        	    System.out.print(j + "\t");
        	        	    contDia++;
        	        	    if(contDia == 7) {
        	        	     	System.out.println(); 
        	        	     	contDia = 0;
        	        	    }
        	         }
          }
	}	

	// Devuelve
	// 0 = Domingo, 1 = Lunes, 2 = Martes, 3 = Miercoles,
	// 4 = Jueves, 5 = Viernes, 6 = Sábado
	private static int zeller(int ano, int mes) {
		int a = (14 - mes) / 12;
		int y = ano - a;
		int m = mes + 12 * a - 2;
		int dia = 1, d;
		d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
		return (d); 
	}

	public static int diasMes(int ano, int mes) {
		if(mes ==1 || mes == 3 || mes ==5 || mes == 7 || mes ==8 || mes == 10 || mes == 12) {
			return 31;
		}else if(mes == 2) {
			if(esBisiesto(ano)) {
				return 29;
			}else {return 28;}
		}
		else return 30;
	}
	
	//funcion para saber si es bisiesto o no
	public static boolean esBisiesto(int ano){
		if(ano % 4==0){	
			if(ano % 100==0){			
				if(ano % 400==0){
					return true;				
				}else{
					return false;
				}			
			}else{
				return true;
			}
		}else {
			return false;
		}	
	}
}
