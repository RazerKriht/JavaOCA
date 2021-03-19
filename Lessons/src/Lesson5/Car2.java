package Lesson5;

public class Car2 {
    String color;
    String engine;
    int speed; //Hello!

    int gas(int speedNum) {
        speed *= speedNum;
        return speed;
    }

    int brake(int speedNum) {
        speed *= speedNum;
        return speed;
    }

    void showInfo() {
        System.out.println("Цвет:" + color + " Мотор:" + engine + " Скорость:" + speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "while";
        c1.engine = "V6";
        c1.speed = 60;
        c1.showInfo();
        c1.gas(20);
        c1.showInfo();
        c1.brake(80);
        c1.showInfo();
    }
}

