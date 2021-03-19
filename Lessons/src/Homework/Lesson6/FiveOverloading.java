package Homework.Lesson6;

public class FiveOverloading {
    int sum() {
        int result = 0;
        return result;
    }

    int sum(int a1) {
        int result = a1;
        return result;
    }

    int sum(int a1, int a2) {
        int result = a1 + a2;
        return result;
    }

    int sum(int a1, int a2, int a3) {
        int result = a1 + a2 + a3;
        return result;
    }

    int sum(int a1, int a2, int a3, int a4) {
        int result = a1 + a2 + a3 + a4;
        return result;
    }
}
