package Day5;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("NOT Adult");
        }
    }
}
