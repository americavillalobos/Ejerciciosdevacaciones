/***********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez           *
 * Fecha de creacion:5/abril/2023                          *  
 * Fecha de actualizacion:5/abril/2023                     *
 * Descripcion:Dados dos valores X e Y que forman un        *
 * intervalo cerrado, y un valor W, realice un programa para* 
 * determinar si W está dentro o fuera del intervalo.      *
 ***********************************************************/
package Intruccionesdecontroldeflujo;

import java.util.Scanner;

public class ejercio8 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor de X: ");
        double x = input.nextDouble();

        System.out.print("Ingrese el valor de Y: ");
        double y = input.nextDouble();

        System.out.print("Ingrese el valor de W: ");
        double w = input.nextDouble();

        if (w >= x && w <= y) {
            System.out.println(w + " está dentro del intervalo cerrado [" + x + ", " + y + "]");
        } else {
            System.out.println(w + " está fuera del intervalo cerrado [" + x + ", " + y + "]");
        }
    }

}
