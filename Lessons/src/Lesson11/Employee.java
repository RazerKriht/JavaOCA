package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salaty){
        this.name = name;
        this.salary = salaty;
    }

    public double maxer(double a){
        a*=2;
        return a;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.maxer(emp1.salary);
        System.out.println(emp1.salary);
        System.out.println(d);
    }
}
