/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author admin
 */
public class Validation {
    public boolean isPositiveNumber(double number){
        return number > 0;
    }
    public boolean isTriangle(double sideA, double sideB, double sideC){
        return sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB;
    }
}
