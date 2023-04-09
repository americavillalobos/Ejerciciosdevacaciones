/***********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez           *
 * Fecha de creacion:4/abril/2023                          *  
 * Fecha de actualizacion:4/abril/2023                     *
 * Descripcion:Clasificación del IMC de acuerdo con la OMS *
 * de la ONU:                                              *
 ***********************************************************/
package Intruccionesdecontroldeflujo;

import java.util.Scanner;

public class ejercio4 {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.println("Ingrese la masa del individuo en kilogramos:");
	        double masa = input.nextDouble();

	        System.out.println("Ingrese la estatura del individuo en metros:");
	        double estatura = input.nextDouble();

	        double imc = masa / (estatura * estatura);

	        System.out.printf("El IMC es: %.2f\n", imc);

	        if (imc < 16) {
	            System.out.println("Clasificación: Criterio de ingreso");
	        } else if (imc < 17) {
	            System.out.println("Clasificación: Infrapeso");
	        } else if (imc < 18.5) {
	            System.out.println("Clasificación: Bajo peso");
	        } else if (imc < 25) {
	            System.out.println("Clasificación: Peso normal");
	        } else if (imc < 30) {
	            System.out.println("Clasificación: Sobrepeso");
	        } else if (imc < 35) {
	            System.out.println("Clasificación: Obesidad premórbida");
	        } else if (imc < 40) {
	            System.out.println("Clasificación: Obesidad severa");
	        } else if (imc < 45) {
	            System.out.println("Clasificación: Obesidad mórbida");
	        } else {
	            System.out.println("Clasificación: Obesidad hipermórbida");
	        }
		
	}

}
