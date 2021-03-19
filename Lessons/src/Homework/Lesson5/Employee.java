package Homework.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        department = department2;
    }

    double unvelichenieZarplati() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25, 555.55, "IT");
        Employee emp2 = new Employee(2, "Petrov", 30, 888.88, "Sales");

        emp1.unvelichenieZarplati();
        System.out.println("Новая зарплата работкника" + emp1.surname + "surname" + ": " + emp1.salary);

        double newSalary = emp2.unvelichenieZarplati();
        System.out.println("Новая зарплата работкника" + emp2.surname + "surname" + ": " + emp2.salary);
    }
}
