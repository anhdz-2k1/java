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
public class Clinder extends Circle{
    private Circle base;
    private double height;

    public Clinder() {
        base = new Circle();
        height = 1.0;
    }

    public Clinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setheight(double height){
        this.height = height;
    }
    public double getAreaAround(){
        return super.getArea()*height;
    }
    public double getTotalArea(){
        return 2*super.getArea() + 2*Math.PI*height*base.getRadius();
    }
    public double getVolume(){
        return 2*Math.PI*base.getRadius()*base.getRadius()*height;
    }

    @Override
    public String toString() {
        return "Clinder{" + "base=" + base + ", height=" + height + '}';
    }
    
}
