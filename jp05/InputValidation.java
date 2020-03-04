/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp05;

import java.util.Scanner;
/**
 *
 * @author Anh
 */
public class InputValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        boolean isValid;
        isValid = false;
        System.out.println("Enter a mumber between 0-10 and 90-100: ");
        do{
            
            a = sc.nextByte();
            if(0 <= a & a <=10 | 90<=a & a <=100   ){
            isValid = true;
        }else {
                System.out.println("Enter a mumber between 0-10 and 90-100: ");
                }
        } while(!isValid);
        
        
    }
    
}
