/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio22;

/**
 *
 * @author aloe6
 */
public class Salario {
    public static Double salario (double salario_hora,double numero_horas){
        if ((salario_hora * numero_horas )> 450000) {
	return (salario_hora * numero_horas);
	}
	else {
	return null;
			
	}
    }
}
