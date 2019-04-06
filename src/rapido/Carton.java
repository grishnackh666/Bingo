/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapido;

import java.util.ArrayList;


public class Carton {
    private final ArrayList<Integer> numero;
    private int tamaño;
    
    
    public Carton(String...numero) {
        this.numero = new ArrayList<Integer>();
    }


    public ArrayList<Integer> getNumero() {
        return numero;
    }

    public int getTamaño() {
        return tamaño;
    }

    

    
    
    
    
    
}
