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
public class SalesTaxCaculator {
    public static void main(String[] args){
        final int SENTINAL = -1;
        Scanner sc = new Scanner(System.in);
        double price, actualPrice, salesTax;
        double totalPrice = 0.0, totalActual = 0.0, totalSales = 0.0;
        System.out.print("Enter the tax-inclusive price dolar(or -1 to and): ");
        price = sc.nextDouble();
        while (price != SENTINAL){
            actualPrice = (price/107)*100;
            salesTax =  (price/107)*7;
            System.out.printf("Actual Price is: %.2f%n", actualPrice);
            System.out.printf("Sales tax is: %.2f%n", salesTax);
            totalPrice += price;
            totalActual += actualPrice;
            totalSales += salesTax;
            
            System.out.print("Enter the tax-inclusive price dolar(or -1 to and): ");
            price = sc.nextDouble();
        }
        System.out.printf("Total price is: %.2f%n", totalPrice);
        System.out.printf("Total actual is: %.2f%n", totalActual);
        System.out.printf("Total sales is: %.2f%n", totalSales);
        
       
    }
    
}
