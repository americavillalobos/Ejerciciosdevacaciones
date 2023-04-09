/******************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez      *
 * Fecha de creacion:6/abril/2023                     *
 * Fecha de actualizacion:6/abril/2023                *
 * Descripcion: Escriba un programa que calcule el valor 𝑛 aproximado de usando la serie:                                      *
 *****************************************************/
package InstruccionesIterativas;

import java.util.Scanner;

public class ejercio3 {

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Introduzca el valor de n: ");
	        int n = input.nextInt();
	        double pi = 0;
	        int signo = 1;
	        for (int i = 1; i <= n; i += 2) {
	            pi += signo * 4.0 / i;
	            signo *= -1;
	        }
	        System.out.println("La aproximación de pi es: " + pi);
	    }
}
