package Day3;

public class Variable {
    int a = 10; //INSTANCE VARIABLE
    static int c =30; //STATIC VARIABLE

    public static void main(String[] args) {
        int b = 20; //LOCAL VARIABLE
        Variable obj = new Variable();
        System.out.println("INSTANCE VARIABLE =" + obj.a);
        System.out.println("LOCAL VARIABLE =" +b);
        System.out.println("STATIC VARIABLE =" +c);
    }
}
