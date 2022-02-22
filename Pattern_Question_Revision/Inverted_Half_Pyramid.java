package Pattern_Question_Revision;

public class Inverted_Half_Pyramid {
    public static void main(String[] args){

        int n =4;//rows
        int m =5; //columns
        //OUTER LOOP
        for(int i=n;i>=1;i--){
            //INNER LOOP
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
