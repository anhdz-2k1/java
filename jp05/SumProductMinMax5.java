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
public class SumProductMinMax5 {
    
    public static void main(String[] args){
        int n, sum = 0,product=1, tempSort;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    
    int array[] = new int[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        array[i] = scanner.nextInt();
    }
    int min = array[0];
    int max = array[0];
    for (int i = 0; i < n; i++) {
         sum += array[i];
         if(array[i] !=0){
               product*=array[i];    
         }   
         if(array[i] < min){
             min = array[i];
         }
         if(array[i] > max){
             max = array[i];
         }
    }
    System.out.println("\nTổng các phần tử có trong mảng = " + sum);
    System.out.println("\nTích các phần tử có trong mảng = " + product);
    System.out.println("\nGiá trị lớn nhất có trong mảng = " + max);
    System.out.println("\nGiá trị nhỏ nhất có trong mảng = " + min);
    
    }
    
}
