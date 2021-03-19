package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("sreda") {
            case "ponedelnik":
            case "vtornik":
            case "sreda":
            case "cetverg":
            case "pantica":
                System.out.println("Работа до 18:00.");
                break;
            case "subota":
                System.out.println("Работа до 12:00.");
                break;
            case "voskresenie":
                System.out.println("Выходной.");
                break;
            default:
                System.out.println("Неправельный день");
        }
    }
}
