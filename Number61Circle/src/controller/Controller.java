/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author admin
 */
import bo.Manager;

public class Controller {
    public static Manager manager = new Manager();
    public double takeWidth(){
        return manager.width();
    }
    public double takeLength(){
        return manager.length();
    }
    public double takeRadius(){
        return manager.radius();
    }
    public double takeSideA(){
        return manager.sideA();
    }
    public double takeSideB(){
        return manager.sideB();
    }
    public double takeSideC(){
        return manager.sideC();
    }
}
