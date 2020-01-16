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
public class teststudent {
    public static void main(String[] args){
        student st1 = new student("Ngoc Trinh");
        System.out.println(st1.toString());
         
        st1.setgpa(3.5);
        System.out.println(st1.toString());
        
    }
    
}
