/**************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez  *
 * Fecha de creacion:8/abril/2023                 *
 * Fecha de actualizacion:8/abril/2023            *
 * Descripcion: Escribir un programa que pida 
 * números positivos al usuario. Mostrar el número 
 * cuya sumatoria de dígitos fue mayor y la cantidad
 *  de números cuya sumatoria de dígitos fue menor que 10.                                   *
 **************************************************/
package Funciones;

import java.util.Scanner;

public class ejercico5 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, maxSum = 0, maxNum = 0, lessThanTen = 0;

        do {
            System.out.print("Ingrese un número positivo (0 para terminar): ");
            num = input.nextInt();

            if (num > 0) {
                int sum = sumOfDigits(num);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxNum = num;
                }
                if (sum < 10) {
                    lessThanTen++;
                }
            }
        } while (num != 0);

        System.out.println("El número cuya sumatoria de dígitos fue mayor es: " + maxNum);
        System.out.println("La cantidad de números cuya sumatoria de dígitos fue menor que 10 es: " + lessThanTen);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
