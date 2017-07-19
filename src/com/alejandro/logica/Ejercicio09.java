package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio09 {
	

	
	int pesoMercancia;
	int valorMercancia;
	
	String esLunes;
	String tipoPago;

	Ejercicio09(){
		
	Scanner entrada = new Scanner(System.in);
	
	 System.out.println("Peso de la Mercancia: ");
	 pesoMercancia = entrada.nextInt();
	 
	 System.out.println("Valor de la Mercancia: ");
	 valorMercancia = entrada.nextInt();
	 
	 System.out.println("Es Lunes [S]i [N]o: ");
	 esLunes = entrada.next();
	 
	 System.out.println("Tipo de pago [E]fectivo [T]arjeta: ");
	 tipoPago = entrada.next();	
	 
	 //calculos
	int tarifa = tarifas(pesoMercancia);
	int dcto = descuentos(valorMercancia, tarifa);
	int promocion = calcularPromocion(esLunes, tipoPago, valorMercancia, tarifa);
	
	//mostrar resultados
	if(promocion > 0){	
		System.out.println("Tarifa: " + tarifa);
		System.out.println("Promocion: " + promocion);
		System.out.println("Total a pagar: " + (tarifa-promocion));
	}else{
		System.out.println("Tarifa: " + tarifa);
		System.out.println("Descuento: " + dcto);
		System.out.println("Total a pagar: " + (tarifa-dcto));		
		
	}
	
	
	
	}
	
	public static int tarifas(int pesoMercancia){
		int tarifa = 0;

		if(pesoMercancia < 100){
			tarifa = 20000;
		}
		else if((pesoMercancia >= 100) && (pesoMercancia <= 150)){
			tarifa = 25000;
		}
		else if((pesoMercancia > 150) && (pesoMercancia <=200)){
			tarifa = 30000;
		}
		else{	 
		    tarifa = 35000 +(pesoMercancia -200) / 10 * 2000;
		    //por cada 10kg adicionales se paga 2000
		}	
		return tarifa;
	}

	public static int descuentos(int valorMercancia, int tarifa){
		int descuento = 0;
		
		if(valorMercancia >= 300000 && valorMercancia <= 600000){
			descuento =  (int) (tarifa * 0.1);
		}
		else if(valorMercancia > 600000 && valorMercancia <= 1000000){
			descuento =  (int) (tarifa * 0.2);
		}
		else if(valorMercancia > 1000000){
			descuento = (int) (tarifa * 0.3);
		}
		return descuento;	
	}
	
	
	public static int calcularPromocion(String esLunes, String tipoPago, int valor, int tarifa){
		
		int promocion = 0;
		
		if(esLunes.equalsIgnoreCase("s") && tipoPago.equalsIgnoreCase("t")){
			promocion = (int)(tarifa * 0.5);
		}
		else if(tipoPago.equalsIgnoreCase("e") && valor > 1000000){
		    promocion = (int) (tarifa * 0.6);
		}
	  return promocion;
	}

}
