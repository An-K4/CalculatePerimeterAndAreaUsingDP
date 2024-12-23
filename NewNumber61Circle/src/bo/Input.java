/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entities.Circle;
import entities.Rectangle;
import entities.Triangle;
import utils.Validation;

/**
 *
 * @author admin
 */
public class Input {
    private Rectangle rectangle;
    private Circle circle;
    private Triangle triangle;
    
    public Input(){
        this.rectangle = new Rectangle();
        this.circle = new Circle();
        this.triangle = new Triangle();
    }
    
    public void input() throws Exception{
        rectangle.setWidth(Validation.getFloat("Please input side width of Rectangle: ", "", 0, Float.MAX_VALUE));
        rectangle.setLength(Validation.getFloat("Please input side length of Rectangle: ", "", 0, Float.MAX_VALUE));
        circle.setRadius(Validation.getFloat("Please input radius of Circle: ", "", 0, Float.MAX_VALUE));
        triangle.setSideA(Validation.getFloat("Please input side A of Triangle: ", "", 0, Float.MAX_VALUE));
        triangle.setSideB(Validation.getFloat("Please input side B of Triangle: ", "", 0, Float.MAX_VALUE));
        triangle.setSideC(Validation.getFloat("Please input side C of Triangle: ", "", 0, Float.MAX_VALUE));
        if(!triangle.isTriangle()){
            throw new Exception("Invalid side of triangle!");
        }
    }
    
    public Rectangle getRectangle(){
        return rectangle;
    }
    public Circle getCircle(){
        return circle;
    }
    public Triangle getTriangle() throws Exception{
        return triangle;
    }
}
