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
public class IncomeTaxCalculator {
     public static void main(String[] args){
        int taxabIncome ;
        double taxPayable;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền");
        taxabIncome = sc.nextInt();
         
        if(taxabIncome <= 20000){
            taxPayable = 0; 
        }else if( 20001 < taxabIncome&& taxabIncome < 40000){
            taxPayable = taxabIncome * 10/100;
        }else if(40001 <taxabIncome && taxabIncome < 60000){
            taxPayable = taxabIncome * 10/100 + taxabIncome * 20/100;
        } else{
            taxPayable = taxabIncome * 10/100 + taxabIncome * 20/100 + taxabIncome * 30/100;
        }
        System.out.printf("Số tiền bạn phải nộp là:%.2f%n ",  taxPayable);
        
         
    }
}

