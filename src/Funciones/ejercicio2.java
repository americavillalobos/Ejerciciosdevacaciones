/**************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez  *
 * Fecha de creacion:7/abril/2023                 *
 * Fecha de actualizacion:7/abril/2023            *
 * Descripcion:Haga una función que reciba como entrada un mes del año y determine el
número de días transcurridos desde el comienzo del año hasta el primer día del
mes                                   *
 **************************************************/
package Funciones;

import java.time.LocalDate;

public class ejercicio2 {
	 public static void main(String[] args) {
	        int mes = 4; 
	        int diasTranscurridos = obtenerDiasTranscurridos(mes);
	        System.out.println("Número de días transcurridos hasta el primer día del mes: " + diasTranscurridos);
	    }

	    public static int obtenerDiasTranscurridos(int mes) {
	        LocalDate fecha = LocalDate.of(LocalDate.now().getYear(), mes, 1);
	        return fecha.getDayOfYear() - 1;
	    }

}
