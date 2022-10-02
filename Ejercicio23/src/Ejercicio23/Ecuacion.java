/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio23;

/**
 *
 * @author aloe6
 */
public class Ecuacion {
    public static String ecuacion (double a,double b,double c){
        double x1, x2;
		 if( a != 0 ) {
			 if( (b*b)-(4*a*c) >= 0 ) {
				 x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
		         x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
		         return (" La solucion 1: " + x1 + " La solucion 2: " + x2);
			 }else {
				 return("Solo raices complejas");
				 
			 }
				 
		 }else {
			return("La unica solucion es : " + -b/c);
			 
		 }
    }
    
}
