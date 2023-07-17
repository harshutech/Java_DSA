public class Flyods_triangle {
    
    public static void flyods_triangle(int rows){
        int num=1;
        //outer loop for rows
        for(int row=1; row<=rows; row++){

            // inner loop for print numbers
            
            for(int number=1; number<=row; number++){
                System.out.print(" " + num);
                num++;
            }
            System.out.println();
        }
    }


    public static void main(String args[]){

        flyods_triangle(5);
    }
}
