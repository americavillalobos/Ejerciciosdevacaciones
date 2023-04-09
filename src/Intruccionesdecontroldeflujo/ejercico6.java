/***********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez           *
 * Fecha de creacion:5/abril/2023                          *  
 * Fecha de actualizacion:5/abril/2023                     *
 * Descripcion:Desarrolle un programa que reciba como      *
 * entrada un número entre 1 y 12 e imprima el nombre      *
 * del mes correspondiente.                                *
 ***********************************************************/
package Intruccionesdecontroldeflujo;

import java.util.Scanner;

public class ejercico6 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int numMes;
	        String nombreMes;

	        do {
	            System.out.print("Ingrese un número entre 1 y 12: ");
	            numMes = sc.nextInt();
	        } while (numMes < 1 || numMes > 12);

	        switch (numMes) {
	            case 1:
	                nombreMes = "Enero";
	                break;
	            case 2:
	                nombreMes = "Febrero";
	                break;
	            case 3:
	                nombreMes = "Marzo";
	                break;
	            case 4:
	                nombreMes = "Abril";
	                break;
	            case 5:
	                nombreMes = "Mayo";
	                break;
	            case 6:
	                nombreMes = "Junio";
	                break;
	            case 7:
	                nombreMes = "Julio";
	                break;
	            case 8:
	                nombreMes = "Agosto";
	                break;
	            case 9:
	                nombreMes = "Septiembre";
	                break;
	            case 10:
	                nombreMes = "Octubre";
	                break;
	            case 11:
	                nombreMes = "Noviembre";
	                break;
	            default:
	                nombreMes = "Diciembre";
	                break;
	        }

	        System.out.println("El mes correspondiente es: " + nombreMes);

	      
	    }

}
