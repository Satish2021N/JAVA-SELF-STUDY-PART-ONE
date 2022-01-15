package Day3;

public class StaticDemo1 {
    static int b = 10;
    static void display()
    {
        System.out.println("STATIC METHOD");
    }
    static
    {
        System.out.println("STATIC BLOCK");
    }

    public static void main(String[] args)
    {
        System.out.println("MAIN METHOD");
        System.out.println(b);
        display();
    }
}
