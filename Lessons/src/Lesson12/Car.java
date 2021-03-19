package Lesson12;

public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("Мощность мотора и количество дверей у перовй машины больше");
            } else System.out.println("Мощность мотора больше у первой машины, но у второй больше дверей.");
        } else {
            if (c1.doorCount < c2.doorCount) {
                System.out.println("Мощность мотора и количество дверей больше у второй машины");
            } else System.out.println("Мощность мотора больше у второй машины, но у первой больше дверей");
        }
    }
}

