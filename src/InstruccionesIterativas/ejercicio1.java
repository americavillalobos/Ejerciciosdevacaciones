/******************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez      *
 * Fecha de creacion:6/abril/2023                     *
 * Fecha de actualizacion:6/abril/2023                *
 * Descripcion: Escribir un programa que pida al usuario
 *  un número entero positivo y muestrepor pantalla todos 
 *  los números impares desde 1 hasta ese número.                                      *
 *****************************************************/
package InstruccionesIterativas;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Ingresa un número entero positivo: ");
	        int num = sc.nextInt();
	        sc.close();
	        System.out.print("Los números impares desde 1 hasta " + num + " son: ");
	        for(int i=1; i<=num; i++){
	            if(i%2!=0){
	                System.out.print(i + " ");
	            }
	        }
	}
}
