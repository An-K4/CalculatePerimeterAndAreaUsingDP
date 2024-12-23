/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entities.Circle;
import entities.Rectangle;
import entities.Triangle;

/**
 *
 * @author admin
 */
public class Manager {
    public Rectangle calculateRectangle(Rectangle rec){
        float width = rec.getWidth();
        float length = rec.getLength();
        
        float area = width * length;
        float perimeter = (width + length) * 2;
        
        rec.setArea(area);
        rec.setPerimeter(perimeter);
        return rec;
    }
    
    public Circle calculateCircle(Circle circle){
        float radius = circle.getRadius();
        
        float area = (float)(Math.PI * radius * radius);
        float perimeter = (float)(2 * Math.PI * radius);
        
        circle.setArea(area);
        circle.setPerimeter(perimeter);
        return circle;
    }
    
    public Triangle calculateTriangle(Triangle triangle){
        float sideA = triangle.getSideA();
        float sideB = triangle.getSideB();
        float sideC = triangle.getSideC();
        
        float perimeter = sideA + sideB + sideC;
        float semiPerimeter = perimeter / 2;
        float area = (float)Math.sqrt(semiPerimeter * 
                                    (semiPerimeter - sideA) *
                                    (semiPerimeter - sideB) *
                                    (semiPerimeter - sideC));
        
        triangle.setArea(area);
        triangle.setPerimeter(perimeter);
        return triangle;
    }
}
