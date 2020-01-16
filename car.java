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
public class car {
    private String plateNumber;
    private int xlocation;
    private int ylocation;
    private int speed;

    public car(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    public void movexright(){
        this.xlocation = xlocation +1;
    }
     public void movexleft(){
        this.xlocation = xlocation -1;
    }
     public void moveup(){
        this.ylocation = ylocation +1;
        this.speed = speed +1;
     }
     public void movedown(){
        this.ylocation = ylocation -1;
        this.speed = speed-1;
     }
     public void park(){
         this.speed = 0;
     }
     public void accelerate(){
        this.speed = speed  +5;
     
     }

    @Override
    public String toString() {
        return "car{" + "plateNumber=" + plateNumber + ", xlocation=" + xlocation + ", ylocation=" + ylocation + ", speed=" + speed + '}';
    }
     
     
    
    
}
