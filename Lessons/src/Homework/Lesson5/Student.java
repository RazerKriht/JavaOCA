package Homework.Lesson5;

class Student {
    int number;
    String firstName;
    String secondName;
    int yearStudy;
    int mathAverageScore;
    int economicAverageScore;
    int englishAverageScore;
}

class StudentTest {

    double sredArifmOcenka(Student st) {
        double sredArifmOcenka = (st.mathAverageScore + st.economicAverageScore + st.englishAverageScore) / 3;
        System.out.println("Sred: " + st.firstName + " " + st.secondName + ": " + sredArifmOcenka);
        return sredArifmOcenka;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.number = 1;
        s1.firstName = "Alex";
        s1.secondName = "Print";
        s1.yearStudy = 2;
        s1.mathAverageScore = 5;
        s1.economicAverageScore = 3;
        s1.englishAverageScore = 3;

        Student s2 = new Student();
        s2.number = 2;
        s2.firstName = "Anna";
        s2.secondName = "Pervona";
        s2.yearStudy = 1;
        s2.mathAverageScore = 3;
        s2.economicAverageScore = 5;
        s2.englishAverageScore = 5;

        Student s3 = new Student();
        s3.number = 3;
        s3.firstName = "Fina";
        s3.secondName = "Alona";
        s3.yearStudy = 3;
        s3.mathAverageScore = 4;
        s3.economicAverageScore = 4;
        s3.englishAverageScore = 4;
    }//1
}
