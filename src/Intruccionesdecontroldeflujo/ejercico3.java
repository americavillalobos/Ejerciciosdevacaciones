/***********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez           *
 * Fecha de creacion:4/abril/2023                          *  
 * Fecha de actualizacion:4/abril/2023                     *
 * Descripcion:numero capicua                              *
 ***********************************************************/
package Intruccionesdecontroldeflujo;

import java.util.Scanner;

public class ejercico3 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Ingresa un número de cuatro dígitos: ");
	        int num = sc.nextInt();

	       
	        int digito1 = num / 1000;
	        int digito2 = (num % 1000) / 100;
	        int digito3 = (num % 100) / 10;
	        int digito4 = num % 10;

	        if (digito1 == digito4 && digito2 == digito3) {
	            System.out.println("Capicúa");
	        } else {
	            System.out.println("No lo es");
	        }
		
	}

}
