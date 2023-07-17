public class Diamond {
    
    public static void diamond(int rows){

        // 1st half
        //outer loop for rows
        for(int row=1; row<=rows; row++){

            //loop for spaces
            for(int space=1; space<=rows-row; space++){
                System.out.print(" ");
            }

            //loop for print stars
            for(int stars=1; stars<=2*(row-1); stars++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
         for(int row=rows; row>=1; row--){

            //loop for spaces
            for(int space=1; space<=rows-row; space++){
                System.out.print(" ");
            }

            //loop for print stars
            for(int stars=1; stars<=2*(row-1); stars++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        diamond(4);
    }
}
