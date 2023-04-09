/**************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez  *
 * Fecha de creacion:8/abril/2023                 *
 * Fecha de actualizacion:8/abril/2023            *
 * Descripcion:Solicitar números al usuario hasta 
 * que ingrese el cero. Por cada uno, mostrar 
 * la suma de sus dígitos (                                   *
 **************************************************/
package Funciones;

import java.util.Scanner;

public class ejercico6 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;
	        do {
	            System.out.print("Ingresa un número (o cero para salir): ");
	            num = sc.nextInt();
	            if (num != 0) {
	                int suma = sumaDigitos(num);
	                System.out.println("La suma de los dígitos de " + num + " es: " + suma);
	            }
	        } while (num != 0);
	        sc.close();
	    }
	    
	    public static int sumaDigitos(int num) {
	        int suma = 0;
	        while (num != 0) {
	            suma += num % 10;
	            num /= 10;
	        }
	        return suma;
	    }
}
