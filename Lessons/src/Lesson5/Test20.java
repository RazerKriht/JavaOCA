package Lesson5;

public class Test20 {
    int summa(int a,int b,int c){
        int result=a+b+c;
        return result;
    }

    int average(int a1, int b1, int c1){
        int result = summa(a1,b1,c1);
        return result;
    }
}


class Test21{
    public static void main(String[] args) {
        Test20 t = new Test20();

        int sumThreeNumbers = t.summa(5,9,12);
        System.out.println(sumThreeNumbers);
        System.out.println(t.summa(1,2,3));

        System.out.println(t.average(20,40,60));



    }
}