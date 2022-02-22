package PatternQuestions;

public class Half_Pyramid {
    //HALF PYRAMID
    public static void main(String[] args){
        //NO. OF ROWS
        int n = 4;
        //OUTER LOOP
        for (int i=1;i<=n;i++){
            //INNER LOOP
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
