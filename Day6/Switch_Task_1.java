package Day6;

import java.util.Scanner;

public class Switch_Task_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println("--------------");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. REMAINDER");
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a operation number: ");
        int number = sc.nextInt();


        switch(number){
        case 1: int c = a+b;
                System.out.println(c);
                break;
        case 2: int d = a-b;
                System.out.println(d);
                break;
        case 3: int e = a*b;
                System.out.println(e);
                break;
        case 4: int f = a/b;
                System.out.println(f);
                break;
        case 5: int g = a%b;
                System.out.println(g);
                break;
        default : System.out.println("Invalid Number");
        }
    } 
}
