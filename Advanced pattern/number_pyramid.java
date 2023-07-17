class number_pyramid{

    public static void num_pyramid(int rows){
        //outer loop for print lines
        for(int row=1; row<=rows; row++){

            //loop for spaces
            for(int spaces=1; spaces<=rows-row; spaces++){
                System.out.print(" ");
            }

            // loop for print numbers
            for(int number=1; number<=row; number++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        num_pyramid(5);
    }
}