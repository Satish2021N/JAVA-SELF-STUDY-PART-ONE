package Day8;

import java.util.Scanner;

public class Program_boolean {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Door1: ");
        boolean Door1 = sc.nextBoolean();
        System.out.println("Door2: ");
        boolean Door2 = sc.nextBoolean();
        System.out.println("Door3: ");
        boolean Door3 = sc.nextBoolean();
        int doorcount =0;
        boolean passedAllDoor = false;

        if(Door1){
            System.out.println("You Passed the First Door");
            doorcount++;
        }
        else{
            System.out.println("You didn't Passed the First Door");
        }
        if(Door2){
            System.out.println("You Passed the Second Door");
            doorcount++;
        }
        else{
            System.out.println("You didn't Passed the Second Door");
        }
        if(Door3){
            System.out.println("You Passed the Third Door");
            doorcount++;
        }
        else{
            System.out.println("You didn't Passed the Third Door");
        }

        if(doorcount == 3){
            passedAllDoor = true;
        }
        if(passedAllDoor){
            System.out.println("You have passed all the door");
        }
        else{
            System.out.println("You didn't passed all the door");
        }
        
    

    }

    
}
