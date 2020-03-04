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
public class Swap2Integers {
    public static void main(String[] args){
        int number1,number2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        number1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        number2 = sc.nextInt();
        System.out.println("Số thứ nhất là: " +number1);
        System.out.println("Số thứ hai là: " +number2);
         int c = number1;
	 number1 = number2;
	 number2 = c;
         System.out.println("sau khi hoán đổi");
         System.out.println("Số thứ nhất là: " +number1);
         System.out.println("Số thứ hai là: " +number2);
         
        
        
    }
}
