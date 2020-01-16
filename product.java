/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad1chuabai;

/**
 *
 * @author Anh
 */
public class product {
    private int id;
    private String name;
    private int price;
    private int qty;
    private String descrption;
    
    

    public product(int id, String name, int price, int qty, String descrption) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.descrption = descrption;
    }

    public product(int id, String name, int price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public product(int id, String name, int price, String descrption) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descrption = descrption;
    }

    public product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    
    
    
    public int getprice(){
        return price;
    }
    public int getqty(){
        return qty;
    
    }
    public double  setprice(int price){
       return this.price = price;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", descrption=" + descrption + '}';
    }
    
     
    
}
