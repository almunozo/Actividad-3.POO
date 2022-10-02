/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesfiguras;

/**
 *
 * @author aloe6
 */
public class Determinar {
    public static String determinar (double baset ,double alturat){
        double hipotenusa =Math.pow(baset * baset + alturat * alturat, 0.5);
        
        if ((baset == alturat) && (baset == hipotenusa) && (alturat == hipotenusa))
                    return ("Es un triángulo equilátero");

                else if ((baset != alturat) && (baset != hipotenusa) && (alturat != hipotenusa))
                    return ("Es un triángulo escaleno");
                else
                    return ("Es un triángulo isósceles");
    }
    
}
