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
public class EmployeeFulltime extends SalaryPolicy{
    private float rate;

   public EmployeeFulltime(float baseSalary) {
        super(baseSalary);
        this.rate = 4;
    }

    public EmployeeFulltime(float baseSalary, float rate) {
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
