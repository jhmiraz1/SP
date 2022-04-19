/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student2;


public class Student2 {
    
   
    private String name;
    private int id;
    
    public void setName(String name){
    
        this.name=name;
    }
    
    public void setId(int id){
    
        this.id=id;
    }
    
    public String  getName(){
    
        return name;
    }
    
    public int getId(){
    
    return id;
    }
    
    public static void main(String[] args) {
        
        
        Student2 o1= new Student2();
        
            o1.setName("miraz");
            o1.setId(31);
            
            System.out.println(o1.getName());
            System.out.println(o1.getId());
            
        
        }
    }
    

    
    


    

