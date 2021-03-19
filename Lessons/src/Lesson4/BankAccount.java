package Lesson4;

public class BankAccount {

    int id = 1;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Vlad";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;

        HisAccount.id = 3;
        HisAccount.name = "Zaur";
        HisAccount.balance = 40.3;

        System.out.println(MyAccount.id + " " + MyAccount.name + " " + MyAccount.balance);
        System.out.println(YourAccount.id + " " + YourAccount.name + " " + YourAccount.balance);
        System.out.println(HisAccount.id + " " + HisAccount.name + " " + HisAccount.balance);
    }

}






















