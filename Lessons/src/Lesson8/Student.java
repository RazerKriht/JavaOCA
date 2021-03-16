package Lesson8;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name2, int course2){
        count++;
        name=name2;
        course=course2;
        System.out.println("Студент №"+count+" создан.");
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",1);
        Student st2 = new Student("Peter",4);
        Student st3 = new Student("Masha",2);
        System.out.println(Student.count);
        //Не хорошо!
        System.out.println(st1.count);
        System.out.println(st2.count);
    }
}
