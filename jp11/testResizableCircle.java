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
public class testResizableCircle {
    public static void main(String[] args) {
        Circle2 c1 = new ResizableCircle(20);
        System.out.println(c1);
        System.out.println("Area is: " + c1.getArea());
        System.out.println("Permioer is: " + c1.getPermier());
        
       
    }
    
}
