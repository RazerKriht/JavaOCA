package Lesson5;

class BankAccaunt{
    int id;
    double balance;
    BankAccaunt(int i,double b){
        id = i;
        balance = b;
    }
}

public class Human {
    String name;
    Car3 car;
    BankAccaunt bA;

    void infoHuman(){
        System.out.println("Имя:" + name + " Цвет машины:"+ car.color + " Баланс банковского счета:"+ bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car=new Car3("red","V8");
        h.bA=new BankAccaunt(18,200.5);
        h.infoHuman();


    }
}
class Car3{
    String color;
    String engine;
    Car3(String c, String e){
        color=c;
        engine=e;
    }

}

