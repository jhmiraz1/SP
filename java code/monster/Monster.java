/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monster;

/**
 *
 * @author miraz
 */
public abstract class Monster {

   protected String name;
   
   public Monster(String name){
   
       this.name=name;
       
   }
   public abstract void attack();
   
    }
    

