/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication39;

/**
 *
 * @author miraz
 */
public class Bike extends Vehicle {
    public void move(){
    
        System.out.println("Bike Moves With Two Wheels");
    }
    
    public static void main(String[] args) {
        
        Bike b=new Bike();
        
        b.move();
    }
    
}
