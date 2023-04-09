/************************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez            *
 * Fecha de creacion:2/abril/2023                           *
 * Fecha de actualizacion:2/abril/2023                      *
 * Descripcion:Escribir un programa que pregunte            *
 * al usuario por el número de horas trabajadas             *
 * y el coste por hora. Después debe mostrar por            *
 *  la pantalla la paga total que le corresponde al usuario *
 *************************************************************/
package TiposdeDatosBasicos;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las horas trabajadas");
		double salario = sc.nextDouble();

		double pago = 200;

		if (salario > 12) {

			double pagar1 = salario * pago;
			System.out.println("Este es el pago: " + pagar1);

		} else if (salario < 6) {

			double pagar2 = salario * pago;
			System.out.println("Este es el pago:" + pagar2);

		}

	}
}
