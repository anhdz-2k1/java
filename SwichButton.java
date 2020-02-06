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
public class SwichButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwichButton() {
        //to do
       
        status=false;
        
    }
    public void connecttoLamp (ElectricLamp lamp){
        this.lamp = lamp;
    }
    public void swithOff(){
        status = false;
        lamp.turnOff();
        
    }
    public  void swithOn(){
        status = true;
        lamp.turnOn();
        
    }
    public static void main(String[] args){
        ElectricLamp l = new ElectricLamp();
        SwichButton s = new SwichButton();
        s.connecttoLamp(l);
        int a = 0;
        for(int i = 0; i<10; i++){
            a = i+1;
            System.out.println("-lần " + a+"-");
            s.swithOff();
        }
    }

    
    
}
