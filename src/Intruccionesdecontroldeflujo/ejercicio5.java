/***********************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez           *
 * Fecha de creacion:5/abril/2023                          *  
 * Fecha de actualizacion:5/abril/2023                     *
 * Descripcion:calcular el Imc de una persona              *
 ***********************************************************/
package Intruccionesdecontroldeflujo;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
      
        System.out.print("Ingrese su peso en libras: ");
        double pesoEnLibras = input.nextDouble();
        
        System.out.print("Ingrese su estatura en centímetros: ");
        double estaturaEnCm = input.nextDouble();
        
      
        double pesoEnKg = pesoEnLibras * 0.453592;
        double estaturaEnMetros = estaturaEnCm / 100.0;
        
        
        double imc = pesoEnKg / (estaturaEnMetros * estaturaEnMetros);
        
       
        String categoria;
        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 25) {
            categoria = "Peso normal";
        } else if (imc < 30) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }
        
        System.out.printf("Peso en kg: %.2f kg\n", pesoEnKg);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);
       
    }
}
