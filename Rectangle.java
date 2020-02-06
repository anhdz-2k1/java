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
public class Rectangle {
     private int width;
     private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }
    public void display(){
        for(int i= 1; i <= width; i++){
            for(int j= 1; j<= height; j++){
                System.out.print("#");
            }
            System.out.println();
             
        }
    }
    public int getArea(){
        return   (height * width);
    }
    public int getPerimeter(){
        return (height + width) * 2;
    }

    public void setHeight() {
        this.height = height +1;
        
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(){
        this.width = width +1;
         
    }
    public int getWidth(){
        return width;
    }

    
    
    
    
    
      
 
     
    
}
