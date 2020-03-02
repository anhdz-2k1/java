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
public class testBook2 {
    public static void main(String[] arg){
       Author[] authors =new  Author[2];
       authors[0] = new Author("Nguyen Vuong Anh", "anhmanchester2k1@gmail.com", 'f');
       authors[1] = new Author("Ronaldo", "rodieu1234@gmail.com", 'f');
        
       Book2 b2 = new Book2("tôi chơi bóng", authors, 50000);
       Book2 b3 = new Book2("cho tôi một vé đi tuổi thơ", authors, 13000, 10);
       System.out.println(b2.getAuthornames());
       
       
       
        
    }
    
}
