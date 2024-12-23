/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.Controller;

/**
 *
 * @author admin
 */
public class NewNumber61Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        try {
            System.out.println("=====Calculator Shape Program=====");
            controller.inputInformation();
            //rectangle
            System.out.println("-----Rectangle-----");
            System.out.println("Width: " + controller.getSideOfRectangle().getWidth());
            System.out.println("Length: " + controller.getSideOfRectangle().getLength());
            System.out.println("Area: " + controller.getSideOfRectangle().getArea());
            System.out.println("Perimeter: " + controller.getSideOfRectangle().getPerimeter());
            //circle
            System.out.println("-----Circle-----");
            System.out.println("Radius: " + controller.getSideOfCircle().getRadius());
            System.out.println("Area: " + controller.getSideOfCircle().getArea());
            System.out.println("Perimeter: " + controller.getSideOfCircle().getPerimeter());
            //triangle
            System.out.println("-----Triangle-----");
            System.out.println("Side A: " + controller.getSideOfTriangle().getSideA());
            System.out.println("Side B: " + controller.getSideOfTriangle().getSideB());
            System.out.println("Side C: " + controller.getSideOfTriangle().getSideC());
            System.out.println("Area: " + controller.getSideOfTriangle().getArea());
            System.out.println("Perimeter: " + controller.getSideOfTriangle().getPerimeter());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
