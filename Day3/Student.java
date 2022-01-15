package Day3;

public class Student {
    String name;
    int rno;
    Student()
    {
        name = "ABC";
        rno = 123;
    }
    Student(String str, int n)
    {
        name = str;
        rno = n;
    }

    public static void main(String[] args) {
        Student s1 = new Student(); //DEFAULT CONSTRUCTOR
        Student s2 = new Student("DEF", 456); //PARAMETARIZED CONSTRUCTOR
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s2.name);
        System.out.println(s2.rno);
    }
}
