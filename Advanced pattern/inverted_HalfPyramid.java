public class inverted_HalfPyramid {


    public static void inverted_halfpyramid(int rows){

        for(int row=1; row<=rows; row++){
            //loop for print spaces
                for(int spaces=1; spaces<=rows-row; spaces++){
                    System.out.print(" ");
                }
            // loop for stars
                for(int stars=1; stars<=row; stars++){
                    System.out.print("*");
                }
                
                System.out.println();
        }

    }



    public static void main(String args[]){
        inverted_halfpyramid(4);
    }
}