package com.company;

import java.util.Scanner;

import clases.CapacidadEndeudamiento;
import mensajes.Mensajes;

public class Main {
	
	//Método principal donde inicia la ejecución del programa
	
	public static void main(String[]args) {
		int opcion = 0;
		
		//Ciclo que me permite ingresar a las opciones informativas del programa
		do {
			System.out.println(Mensajes.ACCESO_MENU_PRINCIPAL);
			System.out.println(Mensajes.INGRESO_OPCION_UNO);
			System.out.println(Mensajes.INGRESO_OPCION_DOS);
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				ingresarInformacion();   
				break;
			case 2:
				System.out.println(Mensajes.FINALIZAR_PROGRAMA);
				System.exit(0);
				break;

			default:
				System.out.println(Mensajes.OPCION_NO_PERMITIDA);
				break;
			}
		}while (opcion != 2);
		}
		
	//Método donde ingreso los valores, para calcular la capacidad de endeudamiento del cliente
	
		private static void ingresarInformacion() {
		 try {
			 Scanner sc = new Scanner(System.in);
				System.out.println(Mensajes.INGRESOS_TOTALES);
				double ingretotales = sc.nextDouble();
				System.out.println(Mensajes.GASTOS_FIJOS);
				double gastosfijos = sc.nextDouble();
				CapacidadEndeudamiento ce = new CapacidadEndeudamiento(ingretotales,gastosfijos);
				double calcularendeuda = ce.calcularCapaEndeu();
				System.out.println(Mensajes.RESULTADO+calcularendeuda);
		} catch (Exception e) {
			System.out.println(Mensajes.INFORMACION_NO_ACEPTADA);
		}
		}
	}


