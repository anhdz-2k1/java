/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad1;

/**
 *
 * @author Anh
 */
public class Student {
    // dinh nghia thuoc tinh
    private  String name;
    private double gpa;
    // 
    public Student(String name, double gpa){
      this.name = name;
      this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
