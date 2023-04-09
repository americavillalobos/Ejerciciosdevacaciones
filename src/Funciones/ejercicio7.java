/**************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez  *
 * Fecha de creacion:8/abril/2023                 *
 * Fecha de actualizacion:8/abril/2023            *
 * Descripcion:Solicitar números al usuario hasta 
 * que ingrese el cero. Por cada uno, mostrar la 
 * suma de sus dígitos                                   *
 **************************************************/
package Funciones;

import java.util.Scanner;

public class ejercicio7 {
	
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, sumaTotal = 0, sumaDigitos = 0;
        
        do {
            System.out.print("Ingresa un número (ingresa 0 para terminar): ");
            num = sc.nextInt();
            sumaDigitos = sumarDigitos(num);
            System.out.println("La suma de los dígitos de " + num + " es: " + sumaDigitos);
            sumaTotal += num;
        } while(num != 0);
        
        System.out.println("La sumatoria de todos los números ingresados es: " + sumaTotal);
    }
    
    public static int sumarDigitos(int num) {
        int suma = 0;
        
        while(num != 0) {
            suma += num % 10;
            num /= 10;
        }
        
        return suma;
    }
}
