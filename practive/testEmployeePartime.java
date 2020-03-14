/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

/**
 *
 * @author Anh
 */
public class testEmployeePartime {
    public static void main(String[] args) {
         EmployeePartime e2 = new EmployeePartime(1000);
        System.out.println(e2.getSalary());
        SalaryPolicy s2 = new EmployeeFulltime(1500);
         System.out.println(s2.getSalary());
    }
    
}
