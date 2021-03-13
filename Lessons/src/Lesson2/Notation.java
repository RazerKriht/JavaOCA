package Lesson2;

public class Notation {
    public static void main(String[] args) {
        int a1 = 60; // Десятеричная
        int a2 = 0B111100; // Двоичная
        int a3 = 074; // Восмиричная
        int a4 = 0x3C; // Шеснадцатиричная

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        int a7 = 1_000_000;
        int a8 = 0B1111_010000100_100_0000;
        int a9 = 03641100;
        int a10 = 0xF4240;

        System.out.println("\n"+a7);
        System.out.println(a8);
        System.out.println(a9);
        System.out.println(a10);

    }
}
