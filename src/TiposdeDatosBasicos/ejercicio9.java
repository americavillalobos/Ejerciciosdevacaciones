/**************************************************************   
 * Autor:America Yaridsaida Villalobos Rodriguez              *
 * Fecha de creacion:3/abril/2023                             *
 * Fecha de actualizacion:3/abril/2023                        *
 * Descripcion:Escriba un programa que reciba como            *
 *  entrada los coeficientes A, B y C de una                  *
 *ecuación de segundo grado, e imprima por pantalla           *
 * los valores de x. Asuma que la ecuación siempre tiene      *
 *  solución en número reales. Recuerde que la solución       *
 *de una ecuación de segundo viene dada por:                  *
 **************************************************************/
package TiposdeDatosBasicos;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese los coeficientes de A,B,C");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		  
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
		
		
		
		 
	}

}
