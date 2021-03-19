package Lesson5;

public class Car {

    Car(String cvet, String motor) {
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины:" + color + " Мотор машины:" + engine);
    }

    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("yellow", "V4");
        System.out.println("Цвет машины:" + car1.color + " Мотор машины:" + car1.engine);

        Car car2 = new Car("white", "V12");
        car2.color = "red";
        car2.engine = "V5";
        System.out.println("Цвет машины:" + car2.color + " Мотор машины:" + car2.engine);


    }
}
