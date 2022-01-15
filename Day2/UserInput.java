package Day2;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value1: ");
        String value1 = sc.nextLine();
        System.out.println("Enter a value2: ");
        String value2 = sc.nextLine();
        System.out.println("Enter a value3: ");
        String value3 = sc.nextLine();
        System.out.println("Enter a value4: ");
        String value4 = sc.nextLine();
        System.out.println("Enter a value5: ");
        String value5 = sc.nextLine();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);


        /*
        Scanner --> We are going to get input from the user with the help of this thing called scanner.
        System.in ---> It means we are gonna get the input from the user from the console.
        sc = Scanner object
        sc.nextline ---> It stores the value that user inputs in the next line.
         */

    }
}
