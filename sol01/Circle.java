/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol01;

/**
 *
 * @author Anh
 */
public class Circle {
    private double radius;
    

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
     public double getRadius(){
        return radius;    
    }
    
    public void setRadius(double radius ){
        this.radius = radius;
    }
    public double setArea(){
        return radius * radius * Math.PI ;
    }
    public double serCircumference(){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle1{" + "radius=" + radius + '}';
    }
    
    
        
    
}
    
    
    
    

