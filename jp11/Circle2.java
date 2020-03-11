/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp11;

/**
 *
 * @author Anh
 */
public class Circle2 implements Geometricobject{
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle2{" + "radius=" + radius + '}';
    }
    @Override
    public double getPermier(){
        return 2*radius*Math.PI;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    void resize(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
