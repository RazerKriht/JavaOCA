package Lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2){
        count++;
        name=name2;
        course=course2;
        System.out.println("Студент №"+count+" создан.");

    }

    public static void showCount(){
        System.out.println("Count = "+count);
    }

    /* public static void main(String[] args) {
        Student st1 = new Student("Ivan",1);
        Student st2 = new Student("Peter",4);
        Student st3 = new Student("Masha",2);
        System.out.println(Student.count);
        //Не хорошо!
        System.out.println(st1.count);
        System.out.println(st2.count);
        //
        Student.showCount();
        st2.showCount();
    }*/

    public void showInfo(){
        System.out.println("Welcome to the Student class!!");
    }
    void  abc(){
        a++;
        count++;
    }

    static void abcd(){
        count++;
        //a++; Нельзя!!!!!!
        Student st2 = new Student("Petr",1);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd();
        //abc(); Нельзя!
        Student st3 = new Student("Vlad",4);
    }
}