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
public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPermiter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
       
        
        
        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPermiter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPermiter());
        System.out.println(s3.getColor());
        System.out.println(s3.isFilled());
        
        
        Rectangle r1 = (Rectangle)s3;
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getColor());

            
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        
    
    
}
}
