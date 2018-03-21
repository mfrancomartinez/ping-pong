/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.event.*;

public class Teclado extends KeyAdapter {//permite trabajar con eventos de teclado y detectar si una tecla ha sido presionanada o no.
    static boolean w,s,up,down;//variables con las que movemos las raquetas
    public void KeyPressed(KeyEvent e){//aparece cada vez que tecleamos
        int id= e.getKeyCode();
        if(id== KeyEvent.VK_W){
            w=true;
            //System.out.println("w");
        }
         if(id== KeyEvent.VK_S){
            s=true;
            //System.out.println("s=true");
        }
          if(id== KeyEvent.VK_UP){
            up=true;
            //System.out.println("up");
        }
           if(id== KeyEvent.VK_DOWN){
            down=true;
            //System.out.println(down);
        }
    }
     public void KeyReleased(KeyEvent e){//aparece cada vex que soltamos una tecla
          int id= e.getKeyCode();
        if(id == KeyEvent.VK_W){
            w=false;
            //System.out.println(w);
        }
         if(id == KeyEvent.VK_S){
            s=false;
            //System.out.println(s);
        }
          if(id == KeyEvent.VK_UP){
            up=false;
            //System.out.println(up);
        }
           if(id == KeyEvent.VK_DOWN){
            down=false;
            System.out.println(down);
        }
         
     }
}
