
package javaapplication36;

/**
 *
 * @author miraz
 */
public class Student {
    
    private String name;
    private int id;
    private double cgpa;
    
    public static void main(String[]args)
    {
     
        Student s1= new Student();
        
        s1.name= "miraz";
        s1.id=14631;
        s1.cgpa=3.54;
        
        System.out.println("name:"+s1.name);
        System.out.println("ID:"+s1.id);
        System.out.println("CGPA:"+s1.cgpa);
     
        
    }
    
}
