package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio10 {
	
	int cc;
	int pc;
	int pa;
	int vol;
	
	String tp;
	String tc;
	String ma;
	
	Ejercicio10(){
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("*********DATOS DE ENTRADA********");
		System.out.println("Costo de compra($)..................................................:");
		cc = entrada.nextInt();
		System.out.println("Tipo de Producto [P]erecedero, [N]o perecedero.......................:");
		tp = entrada.next();
		System.out.println("Tipo de Conservacion[F]rio, [A]mbiente..............................:");
		tc = entrada.next();
		System.out.println("Periodo de Conservacion (dias)......................................:");
		pc = entrada.nextInt();
		System.out.println("Periodo de Almacenamiento (dias)....................................:");
		pa = entrada.nextInt();
		System.out.println("Volumen (litros)....................................................:");
		vol = entrada.nextInt();
		System.out.println("Medio de Almacenamiento[N]evera,[C]ongelador,[E]stanteria,[G]uacal..:");
		ma = entrada.next();
		
		
		//realizar los calculos
		int ca = calcularCostoAlmacenamiento(tp, cc, tc, pc, pa, vol);
		float pdp = calcularPorcentajeDepreciacionProducto(pa);
		int ce = calcularCostoExhibicion(tp, ma, ca);
		
		int vr_p = (int)((cc + ca + ce) * pdp);
		int vr_v = 0;
		
		if(tp.equalsIgnoreCase("p")){//perecedero
			vr_v = (int)(vr_p * 1.4);
		}else{// no perecedero
			vr_v = (int) (vr_p * 1.2);
		}
		
		
		//mostrar resultados
		System.out.println("*********DATOS DE SALIDA********");
		System.out.printf("Costo de producto..............................:%10d\n", cc);
		System.out.printf("Costo de almacenamiento........................:%10d\n",ca);
		System.out.printf("Costo de exhibicion............................:%10d\n",ce);
		System.out.printf("Porcentaje de depreciacion de producto.........:%10.2f\n",pdp);
		System.out.printf("Valor producto.................................:%10d\n",vr_p);
		System.out.printf("Valor venta....................................:%10d\n",vr_v);

		
	}
	
	
	
	public static int calcularCostoAlmacenamiento(String tp, int cc, String tc, int pc, int pa, int vol){
		
		if(tp.equalsIgnoreCase("p")){  //Perecederos
			
			if(tc.equalsIgnoreCase("f")){//y si es frio que en total son dos condiciones como esta en el documento
				if(pc < 10){
					return (int)(cc * 0.05);
				}else{
					return (int)(cc * 0.1);
				}
	
			}else{//si es ambiente que en total son tres condiciones como esta en el doc
				if(pa < 20){
					return (int)(cc * 0.03);
				}else if(pa > 20){
					return (int)(cc * 0.1);
				}else{
					return (int)(cc * 0.05);
				}
	
			}
			
			
		}else{ //no perecederos
			if(vol >= 50){
				return (int) (cc * 0.1);
			}else{
				return (int) (cc * 0.2);
			}
	
		}
	
	}
	
	
	public static float calcularPorcentajeDepreciacionProducto(int pa){
		if(pa < 30){
			return 0.95f;
		}else{
			return 0.85f;
		}
		
	}
	
	
	
   public static int calcularCostoExhibicion(String tp, String ma, int ca){
	   
	   if(tp.equalsIgnoreCase("p")){ //Perecederos
		   if(ma.equalsIgnoreCase("n")){ //Nevera
			   return ca * 2;
		   } else { //Congelador
			   return ca;
		   }
	   }else{// no perecederos
		   if(ma.equalsIgnoreCase("e")){
			   return (int)(ca * 0.05);
			   
		   }	else{//guacal
			   return (int)(ca * 0.07);
		   }   
		   
	   }
   
   }

}
