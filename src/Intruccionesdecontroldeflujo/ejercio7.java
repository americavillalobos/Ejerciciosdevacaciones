/******************************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez                  *
 * Fecha de creacion:5/abril/2023                                 *  
 * Fecha de actualizacion:5/abril/2023                            *
 * Descripcion:Un número de cuatro cifras es feliz si los         *
 *  dos primeros dígitos son mayores que los dos últimos dígitos  *
 *****************************************************************/
package Intruccionesdecontroldeflujo;

import java.util.Scanner;

public class ejercio7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número de cuatro dígitos:");
        int num = sc.nextInt();

        int primero = num / 1000;
        int segundo = (num / 100) % 10;
        int tercero = (num / 10) % 10;
        int cuarto = num % 10;

        if (primero > segundo && segundo > tercero && tercero > cuarto) {
            System.out.println("El número es creciente.");
            if (primero > segundo && segundo > tercero && tercero > cuarto) {
                System.out.println("El número es feliz y creciente, por lo que es un número muy feliz.");
            } else {
                System.out.println("El número es infeliz.");
            }
        } else {
            System.out.println("El número no es creciente.");
            if (primero > segundo && segundo > tercero && tercero > cuarto) {
                System.out.println("El número es feliz, pero no es creciente.");
            } else {
                System.out.println("El número es infeliz y no es creciente.");
            }
        }
    }

}
