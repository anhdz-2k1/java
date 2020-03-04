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
public class CylinderCompution {
     public static void main(String[] args){
        double radius,height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính");
        radius = sc.nextDouble();
        System.out.print("Nhập chiều cao");
        height = sc.nextDouble();
        
        double baseArea =  Math.PI * radius * radius;
         System.out.printf("Diện tích cơ sở của hình trụ là:%.2f%n ",  baseArea);
        double surfaceArea = 2*Math.PI*radius + 2*baseArea;
        System.out.printf("Diện tích bè mặt của hình trụ là:%.2f%n ",  surfaceArea);
        double volume = baseArea * height;
        System.out.printf("Thể tích của hình trụ là:%.2f%n ",  volume);
    }
    
}
