/***********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez           *
 * Fecha de creacion:4/abril/2023                          *  
 * Fecha de actualizacion:4/abril/2023                     *
 * Descripcion:Escribir un programa que pida al usuario    *
 *  dos números y muestre por pantalla su división.        *
 *  Si el divisor es cero, el programa debe mostrar        *
 *  un mensaje de error.                                   *
 ***********************************************************/
package Intruccionesdecontroldeflujo;

import java.util.Scanner;

public class ejercico1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

        System.out.print("Ingrese el dividendo: ");
        double dividendo = sc.nextDouble();
        
        System.out.print("Ingrese el divisor: ");
        double divisor = sc.nextDouble();
        
        if (divisor == 0) {
            System.out.println("Error: el divisor no puede ser cero.");
        } else {
            double resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        }
        
	}
	

}
