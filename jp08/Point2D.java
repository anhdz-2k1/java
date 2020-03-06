/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp08;

/**
 *
 * @author Anh
 */
public class Point2D {
    float x,y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }
    public float getX(){
        return x;
    }
    public void setX(float x ){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getXY(){
        return x + y;
    }

    @Override
    public String toString() {
         return "(" + this.x + "," + this.y + ")";
    }
    
            
            
}
