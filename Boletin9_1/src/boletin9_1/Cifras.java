/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Cifras {
          
    public void numeroContar(){
        int numero, positivo=0, negativo=0, cero=0;
        Scanner ler=new Scanner (System.in);
        for (int contador=0;contador<10;contador++){
            numero=ler.nextInt();
            if(numero>0){
                positivo++;
            }
                else if(numero<0){
                        negativo++;
                        }
                    else {
                        cero++;
                        }
                
                
            
        }
        System.out.println("Positivos  = "+ positivo+"\nNegativos = "+negativo+" \nC ero = "+cero);
    }
}
