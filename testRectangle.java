/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad2;

/**
 *
 * @author Anh
 */
public class testRectangle {
    public static void main (String[] args){
        Rectangle rec1 = new Rectangle(3, 5);
        
        rec1.display();
        System.out.println(rec1.getArea());
        System.out.println(rec1.getPerimeter());
        rec1.setHeight();
        rec1.setWidth();
        System.out.println(rec1.getHeight());
        System.out.println(rec1.getWidth());
        rec1.display();
        
                
        
        
            
    }
    
    
}
    

