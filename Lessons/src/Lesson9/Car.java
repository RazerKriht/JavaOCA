package Lesson9;

public class Car {
    String color = "blue";
    String engine = "V6";
    static int count;

    Car(String color, String engine){
        count++;
        this.color=color;
        this.engine = engine;
    }

    public void showColor(){
        System.out.println("Цвет машины: "+color);
    }

    public void changeColor(String color){
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        this.color = color;
        cena+=1000;
    }

}
