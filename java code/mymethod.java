
package javaapplication37;

import java.util.Scanner;


public class mymethod {
    
    public void sum(){
    
        Scanner input=new Scanner(System.in);
        
        int a =input.nextInt();
        int b= input.nextInt();
        
        int sum= a+b;
        
        System.out.println("Sum = " +sum);
        
    }
    
    public static void main(String[] args) {
        
        mymethod obj= new mymethod();
        
        obj.sum();
    }
    
}
