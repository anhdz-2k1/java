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
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getid(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getbalance(){
        return balance;
    }
    public int crebit(int amount){
        return balance - amount;
    }
    public int debit(int amount){
        if (amount < balance){
            balance = balance - amount;
        }
        else {
            System.out.println("Amount axceeđe balance;");
        }
        return balance;
    }
    public int transferTo(int amount ){
        if (amount < balance){
            
        }
        else
        {System.out.println("Amount axceeđe balance");}
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
    
}
