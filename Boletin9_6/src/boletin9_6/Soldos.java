/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class Soldos {
    public void lecturaSoldos(){
     double soldo;
        int contTrabajadores = 0;
        int contSueldos1 = 0;
        int contSueldos2 = 0;
        do{
            soldo = Double.parseDouble(JOptionPane.showInputDialog("sueldo de un empleado:"));
            if(soldo > 0){
                contTrabajadores++;
            }
            if(soldo >= 1000 && soldo <= 1750){
                contSueldos1++;
            }
            else if(soldo < 1000 && soldo > 0){
                contSueldos2++;
            }
        }while(soldo != 0);
        JOptionPane.showMessageDialog(null, "Número de trabajadores que cobran entre 1000 y 1750€: " 
                + contSueldos1 + "\nPorcentaje de trabajadores que cobran menos de 1000€: " 
                + (contSueldos2*100/contTrabajadores));
    }
}


