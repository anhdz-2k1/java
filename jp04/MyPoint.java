/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp04;

/**
 *
 * @author Anh
 */
public class MyPoint {
    private int x,y;
        private Object MyPoint;


    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int[] getXY(){
        int[] getXY = new int[2];
        getXY[0]=this.x;
        getXY[1]=this.y;
        return getXY;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double distance(MyPoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(Math.pow(xDiff,2)+Math.pow(yDiff,2));
    }

    
    
    
}
