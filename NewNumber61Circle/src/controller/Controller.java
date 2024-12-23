/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Manager;
import bo.Input;
import entities.*;

/**
 *
 * @author admin
 */
public class Controller {
    private final Manager manager;
    private final Input input;
    //final: xuyen suot qua trinh chay controller se k thay doi bien nay, chi duoc khoi tao 1 lan duy nhat
    public Controller(){
        this.manager = new Manager();
        this.input = new Input();
    }
    public void inputInformation() throws Exception{
        input.input();
    }
    
    public Rectangle getSideOfRectangle(){
        return manager.calculateRectangle(input.getRectangle());
    }
    public Triangle getSideOfTriangle() throws Exception{
        return manager.calculateTriangle(input.getTriangle());
    }
    public Circle getSideOfCircle(){
        return manager.calculateCircle(input.getCircle());
    }
    
}
