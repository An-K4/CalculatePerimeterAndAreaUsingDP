/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

/**
 *
 * @author admin
 */

import controller.Controller;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    private static Controller construct = new Controller();
    
    public static void main(String[] args) {
        Output.menu();
        //Rectangle
        Output.outRectangle();
        //Circle
        Output.outCircle();
        //Triangle
        Output.outTriangle();
    }
}
