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
public class CricleComputation {
    public static void main(String[] args){
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính");
        radius = sc.nextDouble();
        double dk = radius * 2;
        System.out.printf("Đường kính của hình tròn là:%.2f%n ",  dk);
        double cv = radius * radius * Math.PI;
        System.out.printf("Chu vi của hình tròn:%.2f%n ", + cv);
        double s = 2 * Math.PI * radius;
        System.out.printf("Diện tích của hình tròn:%.2f%n ", + s);
        
        
        
    }
    
}
