/**************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez  *
 * Fecha de creacion:7/abril/2023                 *
 * Fecha de actualizacion:7/abril/2023            *
 * Descripcion:con funciones calcular el area del  *
 * circulo y  volumen del cilindro                 *
 **************************************************/
package Funciones;

public class ejercicio1 {
	 public static double areaCirculo(double radio) {
		    double area = Math.PI * radio * radio;
		    return area;
		  }

		  public static double volumenCilindro(double radio, double altura) {
		    double areaBase = areaCirculo(radio);
		    double volumen = areaBase * altura;
		    return volumen;
		  }

		  public static void main(String[] args) {
		    double radio = 5.0;
		    double altura = 10.0;
		    double area = areaCirculo(radio);
		    double volumen = volumenCilindro(radio, altura);
		    System.out.println("El área del círculo es: " + area);
		    System.out.println("El volumen del cilindro es: " + volumen);
		  }

}
