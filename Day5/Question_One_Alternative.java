package Day5;

import java.util.Scanner;

public class Question_One_Alternative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        System.out.print("Enter a Number: ");
        int b = sc.nextInt();

        if (a==b){
            System.out.println("Equal");
        }
        else if(a>b){
                System.out.println(a + " is greater than " + b);
            }
        else
            {
                System.out.println(b + " is greater than " + a);
            }
        }


    }
