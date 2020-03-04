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
public class PensionContributionCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age, salary;
        int contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
    
        System.out.println("Please enter your salary: ");
        salary = sc.nextInt();
        System.out.println("Please enter my age: ");
        age = sc.nextInt();
        
        if(age <55){
            employeeContribution = salary * 20/100;
            employerContribution = salary * 17/100;
        } else if(age < 60){
            employeeContribution = salary * 13/100;
            employerContribution = salary * 13/100;
        }
        else if(age < 65){
            employeeContribution = salary * 75/1000;
            employerContribution = salary * 9/1000;
        }else{
            employeeContribution = salary * 5/1000;
            employerContribution = salary * 75/1000;
        }
        System.out.printf("Enter the month salary: $" +salary);
        System.out.printf("Enter the age: " +age);
        System.out.printf("The employee's contribution is: %.2f%n ", employeeContribution );
        System.out.printf("The employer's contribution is: %.2f%n ", employerContribution );
           totalContribution = employeeContribution + employerContribution;
        System.out.printf("The total contribution is: %.2f%n ", totalContribution);   
 
        
    }
    
}
