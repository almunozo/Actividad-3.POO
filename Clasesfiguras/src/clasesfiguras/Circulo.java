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
public class Circulo {
    public double area,perimetro;
    
    public void calcirculo (double radio){
        area =  Math.PI*Math.pow(radio,2);
        perimetro =2*Math.PI*radio;
    }
}
