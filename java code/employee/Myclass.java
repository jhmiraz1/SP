
package employee;


public class Myclass {
    public static void main(String[] args) {
        
        Employee e = new Employee("miraz",1,250000);
        
        System.out.println("Name: "+e.getName());
        System.out.println("Id :" +e.getId());
        System.out.println("Salary :"+e.getSalary());
    }
    
}
