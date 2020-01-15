/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad1;

/**
 *
 * @author Anh
 */
public class Circle {
    private double radius;
    private String color;
    //dinh nghia constructor de khoi tao doi tuong
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
