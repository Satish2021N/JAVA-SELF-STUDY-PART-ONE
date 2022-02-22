package Day7;

import java.util.Scanner;

public class Question7 {
    //Write a program to check whether a number is prime or not
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        int i = 0;
        while(i<=n){
            if (n%i==0){
                counter = counter + 1;
            }
            i ++;
        }
        if (counter==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
        


    }
    
}
