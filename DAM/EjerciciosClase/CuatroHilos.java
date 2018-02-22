/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosClase;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danic
 */
public class CuatroHilos {
    
    public static void main(String[] args) {
        
        long suma1, suma2, suma3, suma4, resultado;
        
            hiloUno uno = new hiloUno();
            
            hiloDos hdos = new hiloDos();   Thread dos = new Thread(hdos);
            
            Suma tres = new Suma(100_000_000);
            Suma cuatro = new Suma(100_000_000);       
            
            uno.start();     dos.start();      tres.start();    cuatro.start();
            
                try {
                    uno.join();        dos.join();          tres.join();          cuatro.join();
                } catch (InterruptedException ex) {
                    System.out.println("Error");
                }
                
            suma1  = uno.getResultado();    
            suma2 = hdos.getResultado(); 
            suma3 = tres.getResultado(); 
            suma4 = cuatro.getResultado(); 
            
            resultado = suma1 + suma2  + suma3 + suma4;
            
            System.out.println(resultado);
     }
}
    
//Ejemplo con Thread
    class hiloUno extends Thread{
             long numero = 100_000_000;
             long resultado = 0;
                                                                    
        @Override
        public void run() {            
            for (int i = 0; i < numero; i++) {                
                            resultado++;             
            }                             
        }

        public long getResultado() {        
            return resultado;
        }                               
    }
    
//Ejemplo con Runnable
    class hiloDos implements Runnable{
          long numero = 100_000_000;
          long resultado = 0;
          
        @Override
        public void run() {
              for (int i = 0; i < numero; i++) {                
                            resultado++;             
            }                    
        }
        
        public long getResultado() {
            return resultado;
        }        
    }
    
//Ejemplo con Thread pero generico para los otros dos
class Suma extends Thread {
	private long valor;
	private long resultado = 0;
	
	public Suma(long valor) {
		super();
		this.valor = valor;
	}
	
	@Override
	public void run() {
		for (long i = 0; i < valor; i++) {
			resultado ++;
		}
	}

	public long getResultado() {
		return resultado;
	}		
}
