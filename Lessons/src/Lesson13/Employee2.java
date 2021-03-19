package Lesson13;

public class Employee2 {
    public static void main(String[] args) {
        int dayDedely = 1;
        final int a = 1;
        final int b = 2;
        switch (dayDedely*1) {
            case a:
            case b:
            case 3:
            case 4:
            case 5:
                System.out.println("Работа до 18:00.");
                break;
            case 6:
                System.out.println("Работа до 12:00.");
                break;
            case 7:
                System.out.println("Выходной.");
                break;
            default:
                System.out.println("Неправельный день");
        }
    }
}
