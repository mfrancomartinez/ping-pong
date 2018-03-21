/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

public class TableroJuego extends JPanel {
    Pelota pelota= new Pelota(0,0);
    Raqueta r1= new Raqueta(10,200);
    Raqueta r2= new Raqueta(794-10-Raqueta.ancho,200);
    
    public TableroJuego(){
        setBackground(Color.BLACK);   
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D z = (Graphics2D)g;
        z.setColor(Color.red);
        dibujar(z);
        actualizar();
    }
    public void dibujar(Graphics2D g){
        g.fill(pelota.getPelota());
        g.fill(r1.getRaqueta());
        g.fill(r2.getRaqueta());
        
    }
    public void actualizar(){
        pelota.mover(getBounds()); //tamaﾃｱos de la lamina
        if (Teclado.w) r1.mover(getBounds(), "up");
        if (Teclado.s) r1.mover(getBounds(), "down");
        if (Teclado.up) r2.mover(getBounds(), "up");
        if (Teclado.down) r2.mover(getBounds(), "down");
    }
    public void iterarJuego(){
        while(true){
            repaint();
            try {
                Thread.sleep(6);
            } catch (InterruptedException ex) {
                Logger.getLogger(TableroJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


//Aqui se introduce el JPanel que la lamina sobre la que se dibuja
