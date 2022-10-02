/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

/**
 *
 * @author aloe6
 */
public class Matricula {
    public static double pago (double p,double es){
        double vm=0,pm=50000;
        if ((p>2000000)&(es>3)) {
	     vm=pm+(0.03*p);
	     return vm ;
	     }else {
	     return pm;
	     }
    }
             
    
}
