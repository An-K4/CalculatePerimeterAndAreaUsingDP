/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author admin
 */
public abstract class Shape {
    private float perimeter;
    private float area;

    public float getPerimeter() {
        return perimeter;
    }

    public float getArea() {
        return area;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" + "perimeter=" + perimeter + ", area=" + area + '}';
    }
    
}
