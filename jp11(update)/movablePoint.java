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
public class movablePoint implements Movable{
    int  x,y,xSpeed,ySpeed;

    public movablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "movablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
    public void moveUp(){
        y -=-ySpeed;
    }
    public void moveDown(){
        y +=+ySpeed;
    }
    public void moveLeft(){
        x -=-xSpeed;
    }
    public void moveRight(){
        x +=+xSpeed;
    }
}
