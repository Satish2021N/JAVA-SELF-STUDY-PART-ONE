package Pattern_Question_Revision;

public class Half_Pyramid {
    public static void main(String[]args){

        int n= 4; //rows
        int m =5; //columns

        //OUTER LOOP
        for (int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    
}
