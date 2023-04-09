/******************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez      *
 * Fecha de creacion:6/abril/2023                     *
 * Fecha de actualizacion:6/abril/2023                *
 * Descripcion:Escribir un programa que solicite el ingreso de una cantidad indeterminada de
números mayores que 1, finalizando cuando se reciba un cero. Imprimir la
cantidad de números primos ingresados.                                       *
 *****************************************************/
package InstruccionesIterativas;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cantidadPrimos = 0;
        do {
            System.out.print("Ingresa un número mayor que 1 (o 0 para salir): ");
            numero = sc.nextInt();
            if (esPrimo(numero)) {
                cantidadPrimos++;
            }
        } while (numero != 0);
        System.out.println("Se ingresaron " + cantidadPrimos + " números primos.");
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
