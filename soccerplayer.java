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
public class soccerplayer {
    private String name;
    private int number;
    private int  xlocation;
    private int  ylocation;

    public soccerplayer(String name, int number, int xlocation, int ylocation) {
        this.name = name;
        this.number = number;
        this.xlocation = xlocation;
        this.ylocation = ylocation;
    }

    public soccerplayer(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public void runleft(){
        this.xlocation = xlocation + 1;
    }
    public void runright(){
        this.xlocation = xlocation -1;
    
    }
   
    public void jump(){
        this.ylocation = ylocation + 1;
    }

    @Override
    public String toString() {
        return "soccerplayer{" + "name=" + name + ", number=" + number + ", xlocation=" + xlocation + ", ylocation=" + ylocation + '}';
    }
   

    
    
}
