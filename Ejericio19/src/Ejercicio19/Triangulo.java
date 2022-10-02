/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio19;

/**
 *
 * @author aloe6
 */
public class Triangulo {
    public double perimetro, h, area;
    public void caltriangulo (double lado){
	perimetro=lado*3;
	h=((Math.sqrt(3))*lado)/2;
	area= (lado*h)/2;
    }
}
