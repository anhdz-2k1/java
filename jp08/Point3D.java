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
public class Point3D extends Point2D{
    private float z;

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        z = 0.0f;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.getXY();
        this.z = z;
    }
    public float getXYZ(){
        return super.getXY() + z;
    }
    @Override
    public String toString() {       
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}
