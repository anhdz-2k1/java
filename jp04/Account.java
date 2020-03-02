/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp04;



/**
 *
 * @author Anh
 */
public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    } 
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", customer=" + customer + ", balance=" + balance + '}';
    }
    
    public String getCustomerName(){
        return customer.getName();
    }
    public double deposit(double amount){
         balance = balance + amount;
         return  balance;
    }
    public double withdraw(double amount){
       if(balance >= amount){
           return balance = balance - amount;
       }
       else{
               System.out.print("amount withdrawn exceeds the current balance ");
               }
        return balance;
        
    }
    
}
