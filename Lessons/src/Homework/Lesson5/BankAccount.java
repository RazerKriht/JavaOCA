package Homework.Lesson5;

public class BankAccount {
    int id =10;
    String name = "Peter";
    double balance = 100;
    void popolnenieScheta(double summaPopolneniya){
        System.out.println("Баланс до пополнения:"+balance);
        System.out.println("Боланс пополняется на:"+summaPopolneniya);
        balance+=summaPopolneniya;
        System.out.println("Баланс после пополнения:"+balance);
        System.out.println();
    }

    void syatieSoScheta(double summaSnytia){
        System.out.println("Баланс до снятия:"+balance);
        System.out.println("С баланнса снимается:"+summaSnytia);
        balance+=summaSnytia;
        System.out.println("Баланс после снятия:"+balance);
        System.out.println();
    }
}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();

        MyAccount.popolnenieScheta(30.5);
        MyAccount.syatieSoScheta(20.5);
    }
}
