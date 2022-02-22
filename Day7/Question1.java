package Day7;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
            //Print the Sum of First n Natural Numbers
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int sum=0;
    for (int i=1; i<=n;i ++){
        sum = sum + i;
    }
    System.out.println(sum);
}
}

