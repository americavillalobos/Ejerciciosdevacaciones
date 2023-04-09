/******************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez      *
 * Fecha de creacion:6/abril/2023                     *
 * Fecha de actualizacion:6/abril/2023                *
 * Descripcion: Dada una secuencia de números terminada en cero, elaborar un algoritmo para
calcular el porcentaje y la suma de los números impares, el porcentaje y la
suma de los números pares, y la suma de todos los números, y cuántos
números fueron ingresados.                                      *
 *****************************************************/
package InstruccionesIterativas;

import java.util.Scanner;

public class ejercio4 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int numero, cantidadNumeros = 0, sumaNumeros = 0, sumaPares = 0, sumaImpares = 0, cantidadPares = 0, cantidadImpares = 0;
	        float porcentajePares, porcentajeImpares;
	        
	        do {
	            System.out.print("Ingrese un número (0 para terminar): ");
	            numero = sc.nextInt();
	            if (numero != 0) {
	                cantidadNumeros++;
	                sumaNumeros += numero;
	                if (numero % 2 == 0) {
	                    cantidadPares++;
	                    sumaPares += numero;
	                } else {
	                    cantidadImpares++;
	                    sumaImpares += numero;
	                }
	            }
	        } while (numero != 0);
	        
	        if (cantidadNumeros > 0) {
	            porcentajePares = (float) cantidadPares / cantidadNumeros * 100;
	            porcentajeImpares = (float) cantidadImpares / cantidadNumeros * 100;
	            System.out.println("Cantidad de números ingresados: " + cantidadNumeros);
	            System.out.println("Suma de todos los números: " + sumaNumeros);
	            System.out.println("Suma de los números pares: " + sumaPares);
	            System.out.println("Porcentaje de números pares: " + porcentajePares + "%");
	            System.out.println("Suma de los números impares: " + sumaImpares);
	            System.out.println("Porcentaje de números impares: " + porcentajeImpares + "%");
	        } else {
	            System.out.println("No se ingresaron números.");
	        }
	    }
}
