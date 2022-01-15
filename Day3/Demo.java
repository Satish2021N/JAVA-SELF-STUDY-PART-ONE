package Day3;

public class Demo {

    static int a = 10; //STATIC VARIABLE
    static void display()  //STATIC METHOD
    {
        System.out.println("STATIC METHOD");
    }
    //STATIC BLOCK
    //The static block will get executed only when the reference of the class that the static block is written is referenced.
    static
    {
        System.out.println("STATIC BLOCK");
    }
}
class StaticDemo
{
    public static void main(String args[])
    {
        System.out.println("MAIN METHOD");
        System.out.println(Demo.a);
        Demo.display();
    }
}
