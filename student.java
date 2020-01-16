/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad1chuabai;

/**
 *
 * @author Anh
 */
public class student {
    private String name;
    private double gpa;
    
    public student(String name, double gpa){
      this.name = name;
      this.gpa = gpa;
    }

    public student(String name) {
        this.name = name;
    }

    public student(double gpa) {
        this.gpa = gpa;
    }
    public String name(){
        return name;
    } 
    public double setgpa(double gpa){
        return this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", gpa=" + gpa + '}';
    }
    
}
