/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author admin
 */
public class Rectangle extends Shape{
    private float width;
    private float length;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(){
        
    }
    
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
    
    
}
