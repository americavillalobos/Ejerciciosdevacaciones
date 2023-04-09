/******************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez      *
 * Fecha de creacion:3/abril/2023                     *
 * Fecha de actualizacion:3/abril/2023                *
 * Descripcion:Escriba un programa que dados          * 
 * la distancia recorrida por un objeto y el tiempo   *
 *que tomó el objeto en recorrer esa distancia,       *
 *calcule su velocidad.                               *
 ******************************************************/

package TiposdeDatosBasicos;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la distancia recorrida del objeto " );
		double distancia = sc.nextDouble();
		
		System.out.println("ingrese el tiempo que le tomo al objeto recorrer esa distancia");
		double tiempo = sc.nextDouble();
		
		double velocidad = distancia / tiempo;
		
		System.out.println("Esta es la velocidad " + velocidad );
		
		
		
	}
	

}
