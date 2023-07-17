class palindrome_pyramid{

    public static void Palindrome_pyramid(int rows){

        // outer loop for rows
        for(int row=1; row<=rows; row++){

            // loop for spaces
            for(int space=1; space<=rows-row; space++){
                System.out.print(" ");
            }
            
            // loop for print numbers in decending order
            for(int decending=row; decending>=1; decending--){
                System.out.print(decending);
            }
        
            // loop for print numbers in accending order
            for(int accending=2; accending<=row; accending++){
                System.out.print(accending);
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Palindrome_pyramid(20);
    }
}