public class Solid_Rhombus {
    
    public static void rhombus(int rows){
        // outer loop for rows
        for(int row=1; row<=rows; row++ ){
            //loop for spaces
            for(int space=1; space<=rows-row; space++){
                System.out.print("   ");
            }
            //loop for print stars
            for(int stars=1; stars<=5; stars++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        rhombus(5);
    }
}
