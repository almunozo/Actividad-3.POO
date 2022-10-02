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
public class Triangulo {

    public double areat, perimetrot, hipotenusa;

    public void caltriangulo(double baset, double alturat) {
        areat = (baset * alturat / 2);
        hipotenusa = Math.pow(baset * baset + alturat * alturat, 0.5);
        perimetrot = (baset + alturat + hipotenusa);
    

}

}
