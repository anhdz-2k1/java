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
public class testRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 6);
        r1.setLength(2);
        r1.setWidth(2);
        r2.setLength(4);
        r2.setWidth(6);    
        System.out.println(r1);
        System.out.println(r2);
        
    }
    
}
