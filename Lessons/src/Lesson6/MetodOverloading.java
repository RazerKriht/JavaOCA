package Lesson6;

public class MetodOverloading {
    void  show(int i1){
        System.out.println(i1);
        System.out.println("Data Type is int");
    }

    void  show(boolean b1){
        System.out.println(b1);
        System.out.println("Data Type is boolean");
    }

    void show(String s1){
        System.out.println(s1);
        System.out.println("Data Type is String");
    }

    void  show(int i1, int i2){
        System.out.println(i1+i2);
        System.out.println("Data Type is int");
    }

    void show(String s, int a){
        System.out.println("String :"+s+" int :"+a);
    }
    void show(int a, String s){
        System.out.println("Какой хороший день!");
    }

}


class MetodOverloadingTest{
    public static void main(String[] args) {
        MetodOverloading mO = new MetodOverloading();
        int a=500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Привет";
        mO.show(s);
        mO.show("Priet",10);
        mO.show(9,"a");
    }
}
