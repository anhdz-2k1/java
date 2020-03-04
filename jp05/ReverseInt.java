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
public class ReverseInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("nhập số bạn muốn: ");
        a = sc.nextInt();
        int temp = 0;
        int  c = 0;
        while (a >0){
            temp = a % 10;
            c = c*10 + temp;
            a = a / 10;
            
        }
          System.out.println("số ngược lại của số bạn chọn là:" + c);     
    }
    
}
