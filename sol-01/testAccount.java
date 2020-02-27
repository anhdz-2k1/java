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
public class testAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("A1", "Nguyen Van A");
        Account acc2 = new Account("A2", "Nguyen Van B", 25);
        
        
        
        System.out.println("credit acc1= "+acc1.crebit(100));
        System.out.println("credit acc2= "+acc2.crebit(200));
        
        System.out.println("debit acc1= "+acc1.debit(200));
        System.out.println("debit acc2= "+acc2.debit(200));
        
        System.out.println("balance acc2 transfer to= "+acc2.transferTo(acc1, 30));
        
        System.out.println(acc1);
        System.out.println(acc2);
        
    }
    
}
