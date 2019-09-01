package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
  private  int x;
    private int y;
    int width = 50;
     int height = 50;
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    int getX() {
    	return x;
    }
    void setX(int x) {
    	this.x =x;
    }
    int getY() {
    	return y;
    }
    void setY(int y) {
    	this.y = y;
    }
    public void update(){
   	 Polymorph move = new MovingMorph(x,y);
   	
    }
    
    public abstract void draw(Graphics g);
}
