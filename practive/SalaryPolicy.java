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
abstract  public class SalaryPolicy {
    private float baseSalary;

    public SalaryPolicy() {
    }

    public SalaryPolicy(float baseSalary) {
        this.baseSalary = baseSalary;
    }
    public float getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(float baseSalary){
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "SalaryPolicy{" + "baseSalary=" + baseSalary + '}';
    }
    abstract public float getSalary();
}
