/***************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez   *
 * Fecha de creacion:3/abril/2023                  *
 * Fecha de actualizacion:3/abril/2023             *
 * Descripcion: Escribir un programa que realice   *
 * la siguiente operación aritmética:              *
 ***************************************************/
package TiposdeDatosBasicos;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la variable x");
		double x = sc.nextDouble();
		
		System.out.println("Introduce la variable y");
		double y = sc.nextDouble();
		
		System.out.println("Introduce la variable z");
		double z = sc.nextDouble();
		
		double resultado = Math.pow(x+y*z,5.0/2.0);
		System.out.println("El resutado es:" + resultado);
		
	}

}
