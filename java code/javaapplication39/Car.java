
package javaapplication39;


public class Car extends Vehicle {
    
    public void move(){
     System.out.println("Car moves with 4 wheels");
    }
    



 public static void main( String[]args){

Car c=new Car();

c.move();
c.carry();
}
    
}
