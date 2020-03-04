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
public class SphereCompution {
    public static void main(String[] args){
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính");
        radius = sc.nextDouble();
        double tt = 4 * Math.PI * radius * radius;
         System.out.printf("Thể tích của hình cầu là:%.2f%n ",  tt);
        double dt = radius * radius * radius * Math.PI * 4/3;
        System.out.printf("Diện tích của hình cầu là:%.2f%n ",  dt);
        
        
        
        
    }
    
}
