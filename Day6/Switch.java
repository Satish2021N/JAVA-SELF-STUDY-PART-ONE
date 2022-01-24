package Day6;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //When there are lots of if else condition and to make our code cleaner we use switch case
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        switch (number){
            case 1: System.out.println("Namaste");
            break;
            case 2 : System.out.println("Hola");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Number");
        }
    }
    
}
