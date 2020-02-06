/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad2;

/**
 *
 * @author Anh
 */
public class Temperature {
    private double cTemp;
    public Temperature(double cTemp) {
        this.cTemp = cTemp;
    }

    public Temperature() {
    }
    
    public double getCTemp(){
        System.out.println("nhiet do ban nhap la");
        return cTemp;
    }
    public void setCTemp(double cTemp){
        this.cTemp = cTemp +1;
    }
    public double getFTemp(){
        System.out.println("do F sau khi chuyen doi la");
        return cTemp * 1.8 + 32;   
    }
    public double getKtemp(){
        System.out.println("do K sau khi chuyen doi la");
        return cTemp + 273.15;   
    }
}
