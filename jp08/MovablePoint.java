/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp08;

/**
 *
 * @author Anh
 */
public class MovablePoint extends Point2D{
    private float xSpeed, ySpeed;

    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        xSpeed = ySpeed = 0.0f;
    }
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public  void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public  float getSpeed(){
        return xSpeed + ySpeed;
    }
    @Override
    public String toString(){
        return "(" + super.getXY() + "," +  "Speed=" +  "(" + this.xSpeed + this.ySpeed + ")" + ")";
    }
    public MovablePoint move(){
        super.x += xSpeed;
        super.y += ySpeed;
        return this;
    }
}
