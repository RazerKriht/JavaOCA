package Lesson9;

public class Car {
    String color = "blue";
    int a=10;
    String engine = "V6";
    static int count;
    //static int count = this.a; Нельзя!!!

    /*public static void changeA(int b){
        this.a=b; Нельзя!!!
    }*/
    public static void changeA(int b){
        Car c = new Car("yelow","V8");
        c.a = b;
    }



    public Car(String color, String engine){
        count++;
        this.color=color;
        this.engine = engine; //
    }

    public void showColor(){
        System.out.println("Цвет машины: "+color);
        this.changeColor("red");
    }

    public void changeColor(String color){
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        this.color = color;
        cena+=1000;
    }

}
