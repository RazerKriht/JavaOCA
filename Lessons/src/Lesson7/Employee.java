package Lesson7;

public class Employee {
    double salary;

    public void dvoynayaZP(){
        System.out.println("Novaya z/p= "+salary);

    }

    public Employee(double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
    }
}