/******************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez      *
 * Fecha de creacion:6/abril/2023                     *
 * Fecha de actualizacion:6/abril/2023                *
 * Descripcion:Dado un valor n, utilizar ciclos para calcular el valor de la expresión:                                      *
 *****************************************************/
package InstruccionesIterativas;

import java.util.Scanner;

public class ejercicio5 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un valor para n: ");
	        int n = sc.nextInt();
	        double resultado = 1.0;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                resultado *= Math.pow(j, 2);
	            }
	        }
	        System.out.println("El resultado de la expresión es: " + resultado);
	    }

}
