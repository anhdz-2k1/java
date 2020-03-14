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
public class EmployeePartime extends SalaryPolicy{
    private float rate;
    
    public EmployeePartime(float baseSalary) {
        super(baseSalary);
        this.rate = (float) 2.5;
    }

    public EmployeePartime(float baseSalary, float rate) {
        super(baseSalary);
        this.rate = rate;
    }
    public float getRate(){
        return rate;
    }
    public void setRate(float rate){
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "EmployeeFulltime{" + "rate=" + rate + super.toString() + '}';
    }
    public float getSalary(){
        return rate*super.getBaseSalary();
    }
    
}
