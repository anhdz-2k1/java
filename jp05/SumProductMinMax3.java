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
public class SumProductMinMax3 {
    public static void main(String[] args){
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap gia tri cua a: ");
    a = sc.nextInt();
    System.out.print("nhap gia tri cua b: ");
    b = sc.nextInt();
    System.out.print("nhap gia tri cua c: ");
    c = sc.nextInt();
    int sum = a + b + c;
    System.out.println("tổng 3 số là: " + sum);
    int product = a * b * c;
    System.out.println("tính 3 số là: " + product);
    int min = a;
    if(b < a && c>a){
        min = a;
    } else if(c < a && b >a){
        min = c;
    } else if(b < a && c < a ){
        if(b < c){
            min = b;
        } else {
            min = c;
        }
    }
        System.out.println("giá trị nhỏ nhất là: " + min);
    int max = a;
    if(b > a && c < a){
        max = a;
    } else if(c > a && b <a){
        max = c;
    } else if(b > a && c > a ){
        if(b > c){
            max = b;
        } else {
            max = c;
        }
    }
        System.out.println("giá trị lớn nhất là: " + max);
    }
}
