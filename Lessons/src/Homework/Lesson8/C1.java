package Homework.Lesson8;

public class C1 {

    static final double PI = 3.14;
    static int r = 15;
    static double S;

    static int met1(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    static void met2(int a, int b) {
        System.out.println("Остаток: " + (a % b));
    }

    void met3() {
        S = PI * Math.sqrt(r);
    }

    static void met4() {
        S = 2 * r * PI;
    }

    void met5() {
        System.out.println("Радиус: " + r);
        System.out.println("Площадь: " + S);
    }
}

class C2 {
    public static void main(String[] args) {
        System.out.println(C1.met1(23, 6, 2));
        System.out.println(C1.met1(3, 5, 6));
        C1.met2(3, 6);
        C1.met2(6, 9);
        C1 c = new C1();
        c.met3();
        c.met5();
        C1.met4();
        c.met5();
    }
}
