/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol01;

/**
 *
 * @author Anh
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    private int getID(){
        return id;
    }
    private String getFirstname (){
        return firstName;
    }
    private String getLastname(){
        return lastName;
    }
    private String getName(){
        return firstName + lastName  ;
    }
    private int getSalary(){
        return salary;
    }
    private void setSalary(int salary){
        this.salary = salary;
    }
    private int getAnnualSalary(){
        return salary * 12;
    }
    private int raiseSalary(int percent){
        return salary+((salary*percent)/100);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + '}';
    }
    
    
    
    
}
