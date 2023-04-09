/***************************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez               *
 * Fecha de creacion:3/abril/2023                              *
 * Fecha de actualizacion:3/abril/2023                         *
 * Descripcion:Escriba un programa que, dadas las              *
 * longitudes de los catetos de un triángulo rectángulo,       *
 *  calcule la longitud de su hipotenusa.                      *
 ***************************************************************/
package TiposdeDatosBasicos;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Ingrese la longitud del primer cateto: ");
	        double cateto1 = sc.nextDouble();
	        
	        System.out.println("Ingrese la longitud del segundo cateto: ");
	        double cateto2 = sc.nextDouble();
	        
	        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	        
	        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
	}

}
