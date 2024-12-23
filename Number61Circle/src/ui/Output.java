/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import bo.Manager;
import controller.Controller;

/**
 *
 * @author admin
 */

public class Output {
    static Controller controller = new Controller();
    public static void menu(){
        System.out.println("=====Calculator Shape Program=====");
        System.out.println("Please input width of Rectangle:");
        Output.controller.takeWidth();
        System.out.println("Please input length of Rectangle:");
        Output.controller.takeLength();
        System.out.println("Please input radius of Circle:");
        Output.controller.takeRadius();
        System.out.println("Please input side A of Triangle:");
        Output.controller.takeSideA();
        System.out.println("Please input side B of Triangle:");
        Output.controller.takeSideB();
        System.out.println("Please input side C of Triangle:");
        Output.controller.takeSideC();
    }
    public static void outCircle(){
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + Controller.manager.circle.radius);
        System.out.println("Area: " + Manager.circleA(Controller.manager.circle.radius));
        System.out.println("Perimeter: " + Manager.circleP(Controller.manager.circle.radius));
    }
    public static void outTriangle(){
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + Controller.manager.triangle.sideA);
        System.out.println("Side B: " + Controller.manager.triangle.sideB);
        System.out.println("Side C: " + Controller.manager.triangle.sideC);
        System.out.println("Area: " + Manager.triangleA(Controller.manager.triangle.sideA, Controller.manager.triangle.sideB, Controller.manager.triangle.sideC));
        System.out.println("Perimeter: "+ Manager.triangleP(Controller.manager.triangle.sideA, Controller.manager.triangle.sideB, Controller.manager.triangle.sideC));
    }
    public static void outRectangle(){
        System.out.println("-----Rectangle-----");
        System.out.println("Width: " + Controller.manager.rectangle.width);
        System.out.println("Length: " + Controller.manager.rectangle.length);
        System.out.println("Area: " + Manager.rectangleA(Controller.manager.rectangle.length, Controller.manager.rectangle.width));
        System.out.println("Perimeter: " + Manager.rectangleP(Controller.manager.rectangle.length, Controller.manager.rectangle.width));
    }
}
