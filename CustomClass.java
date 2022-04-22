package LearnJava;

class Employee{
    int id;
    int salary;
    String name;

    public void printInfo(){
        System.out.println(this.id);
        System.out.println(this.name);
    }
    public int getName(){
        return salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Employee shivam = new Employee();
        shivam.id = 123;
        shivam.name = "Shivam";
        shivam.printInfo();  
        
        shivam.salary = 50000;
        int salary = shivam.getName();
        System.out.println(salary);
        System.out.println(shivam.id);
        System.out.println(shivam.name);
    }    
}