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
public class ElectricLamp {
    private boolean status;

    public ElectricLamp() {
      status = false;
    }
    public void turnOff(){
        status = false;
        System.out.println("den dang tat");
        
    }
    public void turnOn(){
        status = true;
        System.out.println("den dang sang");
       
    }
    
}
