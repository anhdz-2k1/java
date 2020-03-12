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
public class ResizableCircle extends Circle2 implements Resizable {

    public ResizableCircle(double radius ) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" + super.toString() +'}';
    }
    
    
    @Override
    public void resize(int percent){
        super.radius *= percent/100;
    }
    
}
