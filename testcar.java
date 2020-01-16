/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad1chuabai;

/**
 *
 * @author Anh
 */
public class testcar {
    public static void  main (String[] args){
        car car1 = new car("anh252");
        System.out.println(car1.toString());
        
        car1.movedown();
        System.out.println(car1.toString());
        car1.movexright();
        System.out.println(car1.toString());
        car1.accelerate();
        System.out.println(car1.toString());
    
    }
    
}
