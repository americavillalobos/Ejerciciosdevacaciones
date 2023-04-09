/******************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez      *
 * Fecha de creacion:6/abril/2023                     *
 * Fecha de actualizacion:6/abril/2023                *
 * Descripcion: Escribir un programa que pida al usuario un número entero y muestre por
pantalla si es un número primo o no.                                       *
 *****************************************************/
package InstruccionesIterativas;

import java.util.Scanner;

public class ejercio2 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Introduzca un número entero: ");
	        int numero = input.nextInt();
	        boolean esPrimo = true;
	        if (numero < 2) {
	            esPrimo = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(numero); i++) {
	                if (numero % i == 0) {
	                    esPrimo = false;
	                    break;
	                }
	            }
	        }
	        if (esPrimo) {
	            System.out.println(numero + " es un número primo.");
	        } else {
	            System.out.println(numero + " no es un número primo.");
	        }
	    }

}
