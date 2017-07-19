package com.alejandro.logica;

import java.util.Scanner;

public class Ejercicio11 {

	int viajes;
	int ruta;
	int pasajeros;
	int paquetes10;
	int paquetes10y20;
	int paquetes20;

	Ejercicio11() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*********DATOS DE ENTRADA********");

		System.out.println("Numero de Viajes......................:");
		viajes = entrada.nextInt();
		System.out.println("Ruta..................................:");
		ruta = entrada.nextInt();
		System.out.println("Numero de Pasajeros...................:");
		pasajeros = entrada.nextInt();
		System.out.println("Numero de paquetes de menos de 10KG...:");
		paquetes10 = entrada.nextInt();
		System.out.println("Numero de paquetes entre 10KG y 20KG..:");
		paquetes10y20 = entrada.nextInt();
		System.out.println("Numero de paquetes de mas de 20KG.....:");
		paquetes20 = entrada.nextInt();

		// realizar los calculos
		int ingresosPasajeros = calcularIngresosPasajeros(viajes, ruta,pasajeros);
		int ingresosPaquetes = calcularIngresosPaquetes(ruta, paquetes10,paquetes10y20, paquetes20);
        int ingresosTotales = ingresosPasajeros + ingresosPaquetes;
		int pagoAyudante = calcularPagoAyudante(ingresosTotales);
		int pagoSeguro = calcularPagoSeguro(ingresosPasajeros + ingresosPaquetes);
        int consumo = calcularConsumoCombustible(ruta, viajes, pasajeros, paquetes10, paquetes10y20,paquetes20);
		int deduccionesTotales = pagoAyudante + pagoSeguro + consumo;
		int totalLiquidar = ingresosTotales - deduccionesTotales;
		
		// mostrar resultados
		System.out.println("*********DATOS DE SALIDA********");
		System.out.printf("Ingresos por Pasajeros..................:%10d\n",ingresosPasajeros);
		System.out.printf("Ingresos por Paquetes....................:%10d\n",ingresosPaquetes);
		System.out.printf("                                ==========\n");
		System.out.printf("TOTAL INGRESOS............................:%10d\n",ingresosTotales);
		System.out.printf("Ingresos por Paquetes........................:%10d\n",pagoAyudante);
		System.out.printf("Ingresos por Paquetes..........................:%10d\n",pagoSeguro);
		System.out.printf("Ingresos por Paquetes.............................:%10d\n",consumo);
		System.out.printf("                                ==========\n");
		System.out.printf("TOTAL DEDUCCIONES......................:%10d\n",deduccionesTotales);
		System.out.printf("                                ==========\n");
		System.out.printf("TOTAL A LIQUIDAR.......................:%10d\n",totalLiquidar);


	}

	public static int calcularIngresosPasajeros(int viajes, int ruta,
			int pasajeros) {
		int valor = 0;
		// el 1.05 en el porcentaje en lugar de 0.5 es porque estamos
		// incrementando el valor.
		switch (ruta) {
		case 1:
			valor = viajes * 500000;
			if (pasajeros > 50 && pasajeros <= 100) {
				valor = (int) (valor * 1.05);
			} else if (pasajeros > 100 && pasajeros <= 150) {
				valor = (int) (valor * 1.06);
			} else if (pasajeros > 150 && pasajeros <= 200) {
				valor = (int) (valor * 1.07);
			}
			if (pasajeros > 200) {
				valor = (int) (valor * 1.07);
				valor += (pasajeros - 200) * 50;
			}
			break;
		case 2:
			valor = viajes * 600000;
			if (pasajeros > 50 && pasajeros <= 100) {
				valor = (int) (valor * 1.07);
			} else if (pasajeros > 100 && pasajeros <= 150) {
				valor = (int) (valor * 1.08);
			} else if (pasajeros > 150 && pasajeros <= 200) {
				valor = (int) (valor * 1.09);
			}
			if (pasajeros > 200) {
				valor = (int) (valor * 1.09);
				valor += (pasajeros - 200) * 60;
			}
			break;
		case 3:
			valor = viajes * 800000;
			if (pasajeros > 50 && pasajeros <= 100) {
				valor = (int) (valor * 1.10);
			} else if (pasajeros > 100 && pasajeros <= 150) {
				valor = (int) (valor * 1.13);
			} else if (pasajeros > 150 && pasajeros <= 200) {
				valor = (int) (valor * 1.15);
			}
			if (pasajeros > 200) {
				valor = (int) (valor * 1.15);
				valor += (pasajeros - 200) * 100;
			}
			break;
		case 4:
			valor = viajes * 1000000;
			if (pasajeros > 50 && pasajeros <= 100) {
				valor = (int) (valor * 1.125);
			} else if (pasajeros > 100 && pasajeros <= 150) {
				valor = (int) (valor * 1.15);
			} else if (pasajeros > 150 && pasajeros <= 200) {
				valor = (int) (valor * 1.17);
			}
			if (pasajeros > 200) {
				valor = (int) (valor * 1.17);
				valor += (pasajeros - 200) * 150;
			}
			break;

		}
		return valor;
	}

	public static int calcularIngresosPaquetes(int ruta, int paquetes10,
			int paquetes10y20, int paquetes20) {
		int valor = 0;

		if (ruta == 1 || ruta == 2) {
			if (paquetes10 < 50) {
				valor += 100 * paquetes10;
			} else if (paquetes10 >= 50 && paquetes10 <= 100) {
				valor += 120 * paquetes10;
			} else if (paquetes10 > 100 && paquetes10 <= 130) {
				valor += 150 * paquetes10;
			} else if (paquetes10 > 130) {
				valor += 160 * paquetes10;
			}

			if ((paquetes10y20 + paquetes20) < 50) {
				valor += 120 * (paquetes10y20 + paquetes20);
			} else if ((paquetes10y20 + paquetes20) >= 50
					&& (paquetes10y20 + paquetes20) <= 100) {
				valor += 140 * (paquetes10y20 + paquetes20);
			} else if ((paquetes10y20 + paquetes20) > 100
					&& (paquetes10y20 + paquetes20) <= 130) {
				valor += 160 * (paquetes10y20 + paquetes20);
			} else if ((paquetes10y20 + paquetes20) > 130) {
				valor += 180 * (paquetes10y20 + paquetes20);
			}

		} else {
			if (paquetes10 < 50) {
				valor += 130 * paquetes10;
			} else if (paquetes10 >= 50 && paquetes10 <= 100) {
				valor += 160 * paquetes10;
			} else if (paquetes10 > 100 && paquetes10 <= 130) {
				valor += 175 * paquetes10;
			} else if (paquetes10 > 130) {
				valor += 200 * paquetes10;
			}

			if (paquetes10y20 < 50) {
				valor += 140 * paquetes10;
			} else if (paquetes10 >= 50 && paquetes10 <= 100) {
				valor += 180 * paquetes10;
			} else if (paquetes10 > 100 && paquetes10 <= 130) {
				valor += 200 * paquetes10;
			} else if (paquetes10 > 130) {
				valor += 250 * paquetes10;
			}

			if (paquetes20 < 50) {
				valor += 170 * paquetes10;
			} else if (paquetes10 >= 50 && paquetes10 <= 100) {
				valor += 210 * paquetes10;
			} else if (paquetes10 > 100 && paquetes10 <= 130) {
				valor += 250 * paquetes10;
			} else if (paquetes10 > 130) {
				valor += 300 * paquetes10;
			}
		}

		return valor;
	}

	public static int calcularPagoAyudante(int ingresos) {
		if (ingresos < 1000000) {
			return (int) (ingresos * 0.05);
		} else if (ingresos >= 1000000 && ingresos <= 2000000) {
			return (int) (ingresos * 0.08);
		} else if (ingresos > 2000000 && ingresos <= 4000000) {
			return (int) (ingresos * 0.10);
		} else {
			return (int) (ingresos * 0.13);
		}
	}

	public static int calcularPagoSeguro(int ingresos) {
		if (ingresos < 1000000) {
			return (int) (ingresos * 0.03);
		} else if (ingresos >= 1000000 && ingresos <= 2000000) {
			return (int) (ingresos * 0.04);
		} else if (ingresos > 2000000 && ingresos <= 4000000) {
			return (int) (ingresos * 0.06);
		} else {
			return (int) (ingresos * 0.09);
		}
	}

	public static int calcularConsumoCombustible(int ruta, int viajes,int pasajeros, int paquetes10, int paquetes10y20, int paquetes20) {
		int kilometros = 0;

		switch (ruta) {
		case 1:
			kilometros = viajes * 150;
			break;
		case 2:
			kilometros = viajes * 167;
			break;
		case 3:
			kilometros = viajes * 184;
			break;
		case 4:
			kilometros = viajes * 203;
			break;

		}
		
		int consumo =(int) (kilometros / 39 * 8860);
		int peso = pasajeros * 60 + paquetes10 * 10 + paquetes10y20 * 15 + paquetes20* 20;
		
		if(peso > 5000 && peso <= 10000){
			consumo = (int)(consumo * 1.1);
			
		}else if(peso > 10000){
			consumo = (int)(consumo * 1.25);
		}
        return (int)(consumo * 0.75);
	}

}
