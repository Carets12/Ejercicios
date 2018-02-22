/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos.Pruebas;

/**
 *
 * @author danic
 */
public class Main {
    
    public static void main(String[] args){
          
        Proceso p = new Proceso("Proceso1");
        Proceso p2 = new Proceso("Proceso2");
        Proceso p3 = new Proceso("Proceso3");
        
        p.start();
        p2.start();
        p3.start();
                   
    }
    
}
