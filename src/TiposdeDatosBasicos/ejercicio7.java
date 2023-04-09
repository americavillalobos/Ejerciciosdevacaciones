/***********************************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez                       *
 * Fecha de creacion:3/abril/2023                                      *
 * Fecha de actualizacion:3/abril/2023                                 *  
 * Descripcion:Escribe un programa que lea el número de payasos y      *
 * muñecas vendidos en el último pedido y calcule el peso total        *
 * del paquete que será enviado                                        *
 ***********************************************************************/
package TiposdeDatosBasicos;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de payasos vendidos:");
		int numpayasos = sc.nextInt();
		
		System.out.println("ingrese el numero de muñecas vendidos:");
		int nummuñecas = sc.nextInt();
		
		double pesototal = (numpayasos * 112 ) + (nummuñecas * 75);
		
		System.out.println("el peso total del paquete es " + pesototal);
		
	}

}
