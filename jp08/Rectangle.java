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
public class Rectangle extends Shape{
    private double width,length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public  double getLength(){
        return length;
    }
    public  void setLength(){
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length  + super.toString() + '}';
    }
    
}
