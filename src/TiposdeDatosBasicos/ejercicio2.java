/**************************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez              *
 * Fecha de creacion:3/abril/2023                             *
 * Fecha de actualizacion:3/abril/2023                        *
 * Descripcion:Escribir un programa que realice la siguiente  *
 *  operación aritmética:                                     *
 *   𝑥+𝑦 𝑎*�                                                   *
 **************************************************************/
package TiposdeDatosBasicos;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce el valor de la variable x");
	double x = sc.nextDouble();
	
	System.out.println("Introduce el valor de la variable y");
	double y = sc.nextDouble();
	
	System.out.println("Introduce el valor de la variable a");
	double a = sc.nextDouble();
	
	System.out.println("Introduce el valor de la variable b");
	double b = sc.nextDouble();
	
	double aritmetica = x +(y/(a*b));
	
	System.out.println("El valor de la operacion aritmetica es: " + aritmetica);
	}
	

}
