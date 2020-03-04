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
public class Add2Intenger {
    public static void main(String[] args){
        int number1,number2 ;
       
        
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tri cua number1: ");
        number1 = sc.nextInt();
        System.out.print("nhap gia tri cua number2: ");
        number2 = sc.nextInt();
         int sum = number1 + number2;
        System.out.println("giá trị của number1 là: " + number1);
        System.out.println("giá trị của nummber2 là: "+ number2);
        System.out.println("tổng của number1 và number2 là: " + sum);
        
        
    }
    
}
