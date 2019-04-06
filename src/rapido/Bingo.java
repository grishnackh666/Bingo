/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapido;

import java.util.ArrayList;
import java.util.Collections;


public class Bingo {
    private ArrayList<Integer> bombo;
    private ArrayList<Integer> bolas_extraídas;
    private ArrayList<Carton> cartones;
    private ArrayList<Carton> cartones_ganadores;
    private boolean finalizado;
    private int bola_mayor;
    private int tamaño_del_carton;

    public Bingo() {
        this.bombo = new ArrayList<Integer>();
    }

    
    public boolean Comprobar_carton(Carton carton){
       
        for(int x=0;x<bolas_extraídas.size();x++) {
            if(carton==bolas_extraídas){
                return true;
            }
        }
        return false;
    }
    
    public Carton Generar_un_cartón(){
        Carton carton=null;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for(int i=1; i<=30; i++){
            numeros.add(i);
        }
        Collections.shuffle(numeros);
        
        ArrayList<Integer> nmeros_carton = new ArrayList<Integer>();
        int i = 0;
        for(carton ficha : numeros){
            if(i<9){
                nmeros_carton.add(ficha);
        i++;
        carton.addall(nmeros_carton);
        
        this.cartones.add(carton);
        
        
        return carton;
    }
    
    
        
    
    
    /*for(int i=1;i<=30;i++){
            this.bombo.add(i);
        }
          /*this.bombo.add(1);
            this.bombo.add(2);
            this.bombo.add(3);
            this.bombo.add(4);
            this.bombo.add(5);
            this.bombo.add(6);
            this.bombo.add(7);
            this.bombo.add(8);
            this.bombo.add(9);
            this.bombo.add(10);
            this.bombo.add(11);
            this.bombo.add(12);
            this.bombo.add(13);
            this.bombo.add(14);
            this.bombo.add(15);
            this.bombo.add(16);
            this.bombo.add(17);
            this.bombo.add(18);
            this.bombo.add(19);
            this.bombo.add(20);
            this.bombo.add(21);
            this.bombo.add(22);
            this.bombo.add(23);
            this.bombo.add(24);
            this.bombo.add(25);
            this.bombo.add(26);
            this.bombo.add(27);
            this.bombo.add(28);
            this.bombo.add(29);
            this.bombo.add(30);*/


    
    
    
}
