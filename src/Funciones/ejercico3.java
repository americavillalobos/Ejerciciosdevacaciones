/**************************************************
 * Autor:America Yaridsaida Villalobos Rodriguez  *
 * Fecha de creacion:7/abril/2023                 *
 * Fecha de actualizacion:7/abril/2023            *
 * Descripcion:Haga una función para determinar si
 *  un punto (X, Y) está dentro de un rectángulo.
 *  El rectángulo es definido por la coordenada del 
 *  vértice superior izquierdo, su altura y su ancho.                                   *
 **************************************************/
package Funciones;

public class ejercico3 {
	 public static void main(String[] args) {
	      
	        int x1 = 0;
	        int y1 = 0;
	        
	      
	        int height = 10;
	        int width = 20;
	        
	        
	        int x2 = 5;
	        int y2 = 5;
	        
	      
	        if (isInsideRectangle(x1, y1, height, width, x2, y2)) {
	            System.out.println("El punto (" + x2 + ", " + y2 + ") está dentro del rectángulo.");
	        } else {
	            System.out.println("El punto (" + x2 + ", " + y2 + ") está fuera del rectángulo.");
	        }
	    }
	    
	   
	    public static boolean isInsideRectangle(int x1, int y1, int height, int width, int x2, int y2) {
	        if (x2 >= x1 && x2 <= x1 + width && y2 >= y1 && y2 <= y1 + height) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	

}
