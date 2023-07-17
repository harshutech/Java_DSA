public class  Zero_to_1{


    public static void Zero_to_1triangle(int rows){
        
        // outer loop for rows
        for(int row=1; row<=rows; row++){

            // inner loop for print 
            for(int print=1; print<=row; print++){
                if((row+print)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    

    public static void main(String arga[]){
        Zero_to_1triangle(5);
    }
}
