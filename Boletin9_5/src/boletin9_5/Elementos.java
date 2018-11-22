/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class Elementos {
            public void serieSuma(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Numero de repeticiones:"));
        int contador = 2;
        for(int i = 0; i < num; i++){
            System.out.print(contador + "+");
            contador = contador + 2;
        }
    }
    public void serieSumaResta(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Numero de repeticiones:"));
        int contador = 1;
        for(int i = 0; i < num; i++){
           if(contador%2==0){
               System.out.print("+" + contador);
           }
           else{
               System.out.print("-" + contador);
           }
           contador++;
        }
    }
    public void serieComas(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Numero de repeticiones:"));
        int i;
        int contador1 = 0;
        int contador2 = 1;
        int contador3 = contador1 + contador2;
        for(i = 0; i < num; i++){
            switch (i) {
                case 0:
                    JOptionPane.showMessageDialog(null, 0 + ", ");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,1 + ", ");
                    break;
                default:
                    System.out.print(contador3 + ", ");
                    contador1 = contador2;
                    contador2 = contador3;
                    contador3 = contador1 + contador2;
                    break;
            }
        }
    }
}

