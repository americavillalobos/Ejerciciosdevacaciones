/***********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez           *
 * Fecha de creacion:4/abril/2023                          *  
 * Fecha de actualizacion:4/abril/2023                     *
 * Descripcion:Escribir un programa que pregunte al usuario *
 *  su edad y sus ingresos mensuales y muestre por pantall  *
 *   si el usuario tiene que tributar o no.                 *
 ***********************************************************/
package Intruccionesdecontroldeflujo;

import java.util.Scanner;

public class ejercicio2 {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese su edad: ");
	        int edad = sc.nextInt();

	        System.out.print("Ingrese sus ingresos mensuales: ");
	        double ingresos = sc.nextDouble();

	        if (edad >= 16 && ingresos >= 500) {
	            System.out.println("Debe tributar impuestos.");
	        } else {
	            System.out.println("No está obligado a tributar impuestos.");
	        }

}
}