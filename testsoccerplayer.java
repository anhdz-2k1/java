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
public class testsoccerplayer {
    public static void main (String[] args){
        soccerplayer sp1 = new soccerplayer("Vanh Nguyen", 25);
        System.out.println(sp1.toString());
        soccerplayer sp2 = new soccerplayer("Vanh dep trai", 25, 0, 0);
        System.out.println(sp2.toString());
        
        sp2.runleft();
        sp2.runleft();
        System.out.println(sp2.toString());
        sp2.runright();
        System.out.println(sp2.toString());
        sp2.jump();
        System.out.println(sp2.toString());
            
    }
    
    
}
