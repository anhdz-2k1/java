/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad1;


/**
 *
 * @author Anh
 */
public class testlad1 {
    public static void main(String[] args){
        Student student1 = new Student("Vanh Nguyen", 10);
        System.out.println(student1.getName());
        System.out.println(student1.getGpa());
        
        Circle c1 = new Circle(0.1, "red");
        System.out.println("The radius is: "+ c1.getRadius());
        System.out.println("The color is: "+ c1.getColor());
        System.out.println("The area is:"+ c1.getArea());
        
        SoccerPlayer SP1 = new SoccerPlayer();
        SP1.run();
        SP1.jump();
        SP1.kickBall();
       
        Car car1 = new Car();
        car1.move();
        car1.park();
        car1.accelerate();
    }
}
