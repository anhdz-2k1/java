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
public class IncomeTaxCalculatorWithSentinel {
    public static void main(String[] args){
        final int SENTINAL = -1;
        int taxabIncome ;
        double taxPayable;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the taxable income (or -1 to and): $ ");
        taxabIncome = sc.nextInt();
        while (taxabIncome != SENTINAL){
            if(taxabIncome <= 20000){
            taxPayable = 0; 
        }else if( 20001 < taxabIncome&& taxabIncome < 40000){
            taxPayable = taxabIncome * 10/100;
        }else if(40001 <taxabIncome && taxabIncome < 60000){
            taxPayable = taxabIncome * 10/100 + taxabIncome * 20/100;
        } else{
            taxPayable = taxabIncome * 10/100 + taxabIncome * 20/100 + taxabIncome * 30/100;
        }
            System.out.printf("The income tax paable is:%.2f%n ",  taxPayable);
            System.out.print("Enter the taxable income (or -1 to and): $ ");
            taxabIncome = sc.nextInt();
        }
        System.out.println("bye!!!!!");
    }
    
    
}
