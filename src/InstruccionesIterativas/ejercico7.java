/******************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez      *
 * Fecha de creacion:6/abril/2023                     *
 * Fecha de actualizacion:6/abril/2023                *
 * Descripcion:Leer números enteros positivos de teclado, hasta que el usuario ingrese el
número cero e informar cuál fue el mayor y el menor número ingresado.                                       *
 *****************************************************/
package InstruccionesIterativas;

import java.util.Scanner;

public class ejercico7 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        int mayor = 0;
        int menor = 0;
        boolean primerNumero = true;
        
        do {
            System.out.print("Ingrese un número entero positivo (0 para terminar): ");
            numero = input.nextInt();
            
            if (numero > 0) {
                if (primerNumero) {
                    mayor = numero;
                    menor = numero;
                    primerNumero = false;
                } else {
                    if (numero > mayor) {
                        mayor = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }
            }
        } while (numero != 0);
        
        if (!primerNumero) {
            System.out.println("El mayor número ingresado fue: " + mayor);
            System.out.println("El menor número ingresado fue: " + menor);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
        
       
    }
}
