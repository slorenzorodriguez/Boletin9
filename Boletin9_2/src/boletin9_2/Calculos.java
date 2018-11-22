/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author slorenzorodriguez
 */
public class Calculos {

    public Calculos(){}
    public void operaciones(){
        double contador, suma=0,fin=90,multi=1;

        for (contador=10;contador<fin;contador++){
            suma=suma+contador;
            }
        for (contador=10;contador<fin;contador++){
            multi=multi*contador;
        }
                    System.out.println("Suma= "+suma+"\nMultiplicacion= "+multi);
    }
}   

