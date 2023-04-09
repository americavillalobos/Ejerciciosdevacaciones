/**************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez  *
 * Fecha de creacion:7/abril/2023                 *
 * Fecha de actualizacion:7/abril/2023            *
 * Descripcion: Haga un algoritmo para una función que reciba dos parámetros N y K y que
retorne los K dígitos más a la izquierda de N                                  *
 **************************************************/
package Funciones;

public class ejercicio4 {
	 
    public static void main(String[] args) {
        int n = 542207;
        int k = 2;
        int resultado = extraerDigitos(n, k);
        System.out.println(resultado);
    }
    
    public static int extraerDigitos(int n, int k) {
        int divisor = (int) Math.pow(10, (int) Math.log10(n) - k + 1);
        return n / divisor;
    }
}
