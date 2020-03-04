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
public class AverageWithInputValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int NUM_STUDENT = 3;
        int numberId;
        boolean isValid;
        int sum=0;
        double average = 0;
        for(int i = 1; i <= NUM_STUDENT; i++ ){
            
            isValid = false;
            do{
                System.out.println("Enter the mark (0-100) is student" +i );
                numberId = sc.nextInt();
            if(0 <= numberId & numberId <=100 ){
            isValid = true;
        }else {
                System.out.println("Please enter again: ");
                }
        } while(!isValid);
            
            sum += numberId;
            average = sum / NUM_STUDENT;
            
        }
        System.out.println("The averge is:  " +average);
       
    }
    
}
