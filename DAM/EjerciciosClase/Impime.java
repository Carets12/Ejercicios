/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosClase;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danic
 */
public class Impime {
    
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        Thread hilo = new Thread(new Hilo(numero));           
        hilo.start();
        
        Thread hilo2 = new Thread(new Hilo2(numero));        
         hilo2.start();
    }    
}

class Hilo implements Runnable{
    int numero;

    public Hilo(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {            
               try {
                      Thread.sleep((long) (Math.random() * 2_000));
                       System.out.println(Thread.currentThread().getName());
                       System.out.println(numero);
                } catch (InterruptedException ex) {
                      System.out.println("Ación interrumpida");
                }
           
        }

    }
               
}

class Hilo2 implements Runnable{
    int numero;

    public Hilo2(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {      
              try {
                      Thread.sleep((long) (Math.random() * 2_000));
                      System.out.println(Thread.currentThread().getName());
                      System.out.println(numero);
                } catch (InterruptedException ex) {
                      System.out.println("Ación interrumpida");
                }
            
          }
    }
               
}
