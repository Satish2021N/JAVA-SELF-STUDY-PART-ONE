package Day7;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        //Menu Driven Program
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            int marks = sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is Good");
            }
            else if (marks<=89 && marks >=60){
                System.out.println("This is also Good");
            }
            else if (marks<=59 && marks >=0){
                System.out.println("This is good as well");
            }
            else{
                System.out.println("Invalid");
            }
            System.out.print("Enter a number: ");
            input = sc.nextInt();
        }
        while(input==1);
}
    
}
