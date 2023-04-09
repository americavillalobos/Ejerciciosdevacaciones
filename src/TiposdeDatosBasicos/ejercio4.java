/**********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez          *  
 * Fecha de creacion:2/abril/2023                         *
 * Fecha de actualizacion:2/abril/2023                    *
 * Descripcion:Escribir un programa que                   *
 * pida al usuario dos números enteros y muestre por      *
 *pantalla el siguiente mensaje:                          *
 *“<n> entre <m> da un cociente <c> y un resto <r>”,      *
 * donde <n> y <m> son los números introducidos por el    *
 * usuario, y <c> y <r> son el cociente y el resto de la  *
 * división entera respectivamente.                       *
 **********************************************************/
package TiposdeDatosBasicos;

import java.util.Scanner;

public class ejercio4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese el primer numero entero ");
	int num1 = sc.nextInt();
	
	System.out.println("Ingrese el segundo numero entero ");
	int num2 = sc.nextInt();
	
	int cociente = num1 / num2;
	
	int resto = num1 % num2;
	
	System.out.println(num1 + "entre " + num2 + "da un cociente " + cociente + " y un resto " + resto );
}
}
