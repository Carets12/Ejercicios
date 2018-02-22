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
public class MainMetodoDos implements Runnable{
    
    private ProcesoMetodoDos metodoDos;

    public MainMetodoDos(ProcesoMetodoDos metodoDos) {
        this.metodoDos = metodoDos;
    }
          
    public static void main(String[] args){
        
        ProcesoMetodoDos metodoDos = new ProcesoMetodoDos("Daniel");
        ProcesoMetodoDos metodoTres = new ProcesoMetodoDos("Lucía");
        
        Runnable proceso1 = new MainMetodoDos(metodoDos);
        Runnable proceso2 = new MainMetodoDos(metodoTres);
        
        new Thread(proceso1).start();
        new Thread(proceso2).start();
        
    }
            
    @Override
    public void run() {        
           for (int i = 0; i <= 10; i++) {          
            System.out.println(metodoDos.getNombre());
           }        
    }
    
}
