public class inverted_numberPyrmind {
    
    public static void inverted_numberPyramid(int rows){

        // outer loop for rows
        for(int row=1; row<=rows; row++){

            // loop for print number
            for(int number=1; number<=rows-row+1; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
    



    public static void main(String args[]){
        // function calling
        inverted_numberPyramid(5);
    }
}
