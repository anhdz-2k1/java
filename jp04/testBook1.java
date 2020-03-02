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
public class testBook1 {
    public static void main(String[] arg){
        Author a1 = new Author("Nguyen Vuong Anh", "anhmanchester2k1@gmail.com", 'f');
        System.out.println(a1.toString());
        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        System.out.println(a1.getemail());
        a1.setEmail("anhnvth1908025@fpt.edu.vn");
        System.out.println(a1.toString());
        
        Book b1 = new Book("Sir Alex lãnh đạo chứ không dẫn dắt", a1, 50000);
        System.out.println(b1.toString());
        b1.setPrice(40000);
        System.out.println(b1.toString());
        
    }
    
}
