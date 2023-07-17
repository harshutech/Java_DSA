public class butterfly {
    
    public static void butterfly_pattern(int rows){
        
        //outer loop for 1st half of pattern
        for(int row=1; row<=rows; row++){
            //loop for stars
            for(int star=1; star<=row; star++){
                System.out.print("*");
            }
            //loop for spaces
            for(int space=1; space<=2*(rows-row); space++){
            System.out.print(" ");
            }
            // again loop for stars
            for(int star=1; star<=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }

          //outer loop for 2nd half of pattern
        for(int row=rows; row>=1; row--){
            //loop for stars
            for(int star=1; star<=row; star++){
                System.out.print("*");
            }
            //loop for spaces
            for(int space=1; space<=2*(rows-row); space++){
            System.out.print(" ");
            }
            // again loop for stars
            for(int star=1; star<=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String args[]){
        butterfly_pattern(4);
    }
}
