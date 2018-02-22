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
public class Proceso  extends Thread {

    public Proceso(String msg) {
       super(msg);  
    }


    
    
    @Override
    public void run() {
        super.run(); 
    
           for (int i = 0; i <= 10; i++) {          
            System.out.println(this.getName());
        
        }
        
    }
       
}
