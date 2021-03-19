package Lesson13;

public class Test1 {

}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        if (st1.grade == 2) {
            System.out.println("Двоишник");
        } else if (st1.grade == 3) {
            System.out.println("Троишник");
        } else if (st1.grade == 4) {
            System.out.println("Хорошист");
        } else if (st1.grade == 5) {
            System.out.println("Отличник");
        } else {
            System.out.println("Ошибка данных");
        }

        switch (st1.grade) {
            case 2:
                System.out.println("Двоишник");
                break;
            case 3:
                System.out.println("Троишник");
                break;
            case 4:
                System.out.println("Хорошист");
                break;
            case 5:
                System.out.println("Отличник");
                break;
            default:
                System.out.println("Ошибка данных");
        }
    }
}
