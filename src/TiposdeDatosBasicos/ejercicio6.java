/***********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez           *
 * Fecha de creacion:3/abril/2023                          *
 * Fecha de actualizacion:3/abril/2023                     *
 * Descripcion:Escriba un programa que lea un número       *  
 * de cuatro dígitos y muestre en pantalla el número       *
 * escrito en reverso                                      *
 ***********************************************************/
package TiposdeDatosBasicos;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un numero de cuatro digitos ");
		int num = sc.nextInt(); 
		
		int digito1 = num % 10;
		int digito2 = (num /10 )%10;
		int digito3 = (num / 100)%10;
		int digito4 = (num / 1000)%10;
		
		int numreversa = digito1 *1000 + digito2 *100 + digito3 * 10 + digito4;
		
		System.out.println("tu numero en reversa es " + numreversa);
		
	}

}
