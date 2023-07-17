class Hollow_rect{

    public static void Hollow_pattern(int rows, int column){

        // outer loop 
        for(int i=1; i<=rows; i++){

            // inner loop
            for(int j=1; j<=column; j++){
                //logic
                if(i==1 || i==rows|| j==1 || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String args[]){

        Hollow_pattern(4, 5);
    }
}