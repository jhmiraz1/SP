/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author miraz
 */
public class TransportCompany {
    
    public static void main (String[]args){
    
        Car c=new Car("BMW", 100,23);
        
        System.out.println(c.carName);
        System.out.println(c.carSpeed);
        System.out.println(c.carId);
        
        System.out.println("\n\t driver details\n");
        Driver d=new Driver("Miraz", 23);
        
        System.out.println(d.driverName);
        System.out.println(d.driverAge);
        
        
    
    }
    
}
