/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Raqueta {
    private int x,y;
    static final int ancho=10,alto=40;
    public Raqueta(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle2D getRaqueta(){
       return new Rectangle2D.Double(x,y,ancho,alto); 
    }
    public void mover(Rectangle limites, String action){
        if(action.compareTo("up")==0 && y>limites.getMinY() ){
          y--;  
        }
        
        if(action.compareTo("down")==0 && y<limites.getMaxY()-alto){
          y++;  
        }
    }
    
    
}
