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
public class testproduct {
    public static void main(String[] args){
        product p1 =  new product(1, "msi", 5000);
        System.out.println(p1.toString());
        
        product p2 = new product(2, "mssi gf 63", 20000, 2);
        System.out.println(p2.toString());
        p2.setprice(30000);   
        System.out.println(p2.toString());
        
       
   }
    
}
