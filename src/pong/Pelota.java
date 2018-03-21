/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

    
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Pelota {
    private int x,y;
    private int a=1,b=1;
    private final int ancho=15,alto=15;
    public Pelota(int x,int y){
        this.x=x;
        this.y=y;
    
}
    public Rectangle2D getPelota(){
        return new Rectangle2D.Double(x,y,ancho,alto) ;
    }
    public void mover(Rectangle limites){
        x+=a;
        y+=b;
        
         if(y>limites.getMaxY()){
         b=-b;   
        }
         if(x<0){
             a=-a;
         }
         if(y<0){
        b=-b;
    }
    }
    
}
