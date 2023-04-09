/***********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez           *
 * Fecha de creacion:5/abril/2023                          *  
 * Fecha de actualizacion:5/abril/2023                     *
 * Descripcion:Cree un algoritmo que tome como entrada la  *
 *  hora exacta (horas, minutos,segundos y AM/PM) e indique* 
 *  el número de segundos transcurridos durante esedía.    *
 ***********************************************************/
package Intruccionesdecontroldeflujo;

import java.util.Scanner;

public class ejercio9 {

	public static void main(String[] args) {
        // Crear objeto Scanner para leer entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario la hora exacta
        System.out.print("Ingrese la hora exacta (en formato horas:minutos:segundos AM/PM): ");
        String hora = entrada.nextLine();

        // Dividir la hora en horas, minutos, segundos y AM/PM
        String[] partesHora = hora.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);
        int segundos = Integer.parseInt(partesHora[2].substring(0, 2)); // Ignorar los últimos dos caracteres (AM/PM)
        boolean esPM = partesHora[2].substring(2).equalsIgnoreCase("PM");

        // Calcular el número de segundos transcurridos
        int segundosTranscurridos = 0;
        segundosTranscurridos += horas * 3600; // Convertir horas a segundos
        segundosTranscurridos += minutos * 60; // Convertir minutos a segundos
        segundosTranscurridos += segundos; // Sumar los segundos

        // Si es PM, sumar 12 horas adicionales (excepto si son las 12 PM)
        if (esPM && horas != 12) {
            segundosTranscurridos += 12 * 3600;
        }

        // Mostrar el resultado
        System.out.println("El número de segundos transcurridos durante el día es: " + segundosTranscurridos);
    }
}
