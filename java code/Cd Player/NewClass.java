/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication41;

/**
 *
 * @author miraz
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println("\tCDPlayer\t");
       CDPlayer o1 =new CDPlayer();
       
       o1.audio();
       o1.play();
       o1.stop();
       o1.reverse();
       o1.pause();
        System.out.println("\t DVDPlayer\t");
       DVDPlayer o2=new DVDPlayer();
       
       o2.video();
       o2.play();
       o2.pause();
       o2.stop();
       o2.reverse();
       
       
        
    }
    
}
