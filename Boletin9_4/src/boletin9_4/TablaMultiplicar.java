/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class TablaMultiplicar {
    public void TablaMultiplicar(){
        int num;
        do{
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero positivo:"));
        if(num > 0){
            JOptionPane.showMessageDialog(null, "Tabla de multiplicar del número " + num + ":");
                for(int i = 1; i < 11; i++){
                    JOptionPane.showMessageDialog(null, num + " * " + i + " = " + num*i );
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fin programa");
        }
        }while(num != 0);
        
    }
    

}
