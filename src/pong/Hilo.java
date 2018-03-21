/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Hilo extends Thread implements Runnable {
    
    TableroJuego lamina;  
   

    public Hilo(TableroJuego lamina) {
        this.lamina = lamina;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            lamina.repaint();
        }
    }
}



//Movimiento de la pelota y raquetas.
