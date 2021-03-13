package Lesson4;

public class Car {

    String color = "red";
    String engine = "V6";
}
class CarTest{
    public static void main(String[] args) {
        int a;
        String candy = new String("Alpin Gold");

        Car car1 = new Car();
        Car car2 = car1;

        System.out.println(car2.engine);
        Car car3;
        System.out.println(new Car().color);

        car1.color="balck";
        car1.engine="V8";
        System.out.println(car1.color+" " +car1.engine);
    }
}

