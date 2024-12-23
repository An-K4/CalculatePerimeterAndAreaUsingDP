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
public class Manager {
    static Validation valid = new Validation();
    public Rectangle rectangle = new Rectangle();
    public Circle circle = new Circle();
    public Triangle triangle = new Triangle();
    static Input Input = new Input();
    public double radius(){
        circle.setRadius(Input.input());
        return circle.getRadius();
    }
    public double length(){
        rectangle.setLength(Input.input());
        return rectangle.getLength();
    }
    public double width(){
        rectangle.setWidth(Input.input());
        return rectangle.getWidth();
    }
    public double sideA(){
        return triangle.sideA = Input.input();
    }
    public double sideB(){
        return triangle.sideB = Input.input();
    }
    public double sideC(){
        return triangle.sideC = Input.input();
    }
    public static double circleP(double radius){
        if(valid.isPositiveNumber(radius)){
            double perimeterCircle = 2 * radius * Math.PI;
            return perimeterCircle;
        } else {
            System.err.println("Error Input!");
            System.exit(1);
            return 1;
        }
    }
    public static double circleA(double radius){
        if(valid.isPositiveNumber(radius)){
            double areaCircle = radius * radius * Math.PI;
            return areaCircle;
        } else {
            System.err.println("Error Input!");
            System.exit(1);
            return 1;
        }
    }
    public static double triangleP(double sideA, double sideB, double sideC) throws Exception{
        if(valid.isPositiveNumber(sideC) && valid.isPositiveNumber(sideA) && valid.isPositiveNumber(sideB) && valid.isTriangle(sideA, sideB, sideC)){
            double perimeterTriangle = sideA + sideB + sideC;
            return perimeterTriangle;
        } throw new Exception("Error Input!");
    }
    public static double triangleA(double sideA, double sideB, double sideC) throws Exception{
        if(valid.isPositiveNumber(sideC) && valid.isPositiveNumber(sideA) && valid.isPositiveNumber(sideB) && valid.isTriangle(sideA, sideB, sideC)){
            double halfParameter = (sideA + sideB + sideC) / 2;
            double areaTriangle = Math.sqrt(halfParameter * (halfParameter - sideA) * (halfParameter - sideB) * (halfParameter - sideC));
            return areaTriangle;
        } throw new Exception("Error Input!");
    }
    public static double rectangleP(double length, double width) throws Exception{
        if(valid.isPositiveNumber(width) && valid.isPositiveNumber(length)){
            double perimeterRectangle = 2 * (length + width);
            return perimeterRectangle;
        } throw new Exception("Error Input!");
    }
    public static double rectangleA(double length, double width) throws Exception{
        if(valid.isPositiveNumber(width) && valid.isPositiveNumber(length)){
            double areaRectangle = length * width;
            return areaRectangle;
        } throw new Exception("Error Input!");
    }
}
