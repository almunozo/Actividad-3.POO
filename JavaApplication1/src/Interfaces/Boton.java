/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author aloe6
 */
public class Boton {
    
    public double slbruto ,rfuente,slneto;
        
    public void calsalario (double nhoras,double vhora,double porcentaje){
        slbruto=nhoras*vhora;
	porcentaje=porcentaje/100;
	rfuente=slbruto*porcentaje;
	slneto=slbruto-rfuente;
        
    }
    
}
