package Lesson9;

public class Car {
    String color = "blue";
    String enjine = "V6";
}

class Human{
    String name = "Ivan";
    final Car c = new Car();
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c.enjine="V12";
    }
}