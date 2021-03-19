package Lesson14;

public class Test2 {
    public static void main(String[] args) {

        for (int i = 1, j = 2, k = 7; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("\n\n");

        for (int i = 5; i < 11; i+=1,abc(i));
        System.out.println("\n\n");
        for (int i = 5; i < 11; i+=1){
            abc(i);
        }
    }
    static void abc(int n){
        System.out.println(n);
    }
}
