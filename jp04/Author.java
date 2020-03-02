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
public class Author {
    String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "author{" + "name=" + name + ", email=" + email + ", gender=" + gender + '}';
    }
    
    
}
