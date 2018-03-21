/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;
import javax.swing.JFrame;
public class Ventana extends JFrame{
    private final int ancho=800,alto=500;
    private TableroJuego lamina;
    private Hilo hilo;
    public Ventana(){
        setTitle("pong");//titulo ventana
        setSize(ancho,alto);//cantidad de tamano
        setLocationRelativeTo(null);//colocar la ventana al centro por defecto del null
        setResizable(false);
        addKeyListener(new Teclado());
        lamina=new TableroJuego();
        add(lamina);
        hilo=new Hilo(lamina);
        hilo.start();
        lamina.actualizar();
   
         
    }
}


