package Day7;

import java.util.Scanner;

public class Question2 {
    //Print the table of a number input by the user
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i<=10; i++){
            System.out.println(n*i);
        }
        
    }
}
