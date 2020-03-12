/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp11;

/**
 *
 * @author Anh
 */
public class MovableRectangle implements Movable{
     private movablePoint topleft, bottomRight;

    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed, int ySpeed) {
        topleft = new movablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new movablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topleft=" + topleft + ", bottomRight=" + bottomRight + '}';
    }
    @Override
    public void moveUp(){
       topleft.y -= topleft.ySpeed;
    }
     @Override
    public void moveDown(){
        topleft.y += topleft.ySpeed;
    }
     @Override
    public void moveLeft(){
       bottomRight.x -= bottomRight.xSpeed;
    }
     @Override
    public void moveRight(){
        bottomRight.x += bottomRight.xSpeed;
    } 
}
