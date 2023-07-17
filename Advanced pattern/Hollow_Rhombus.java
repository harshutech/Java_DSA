public class Hollow_Rhombus {

    public static void hollow_rhombus(int rows){
        //outer loop
        for(int row=1; row<=rows; row++){

            //print spaces
            for(int spaces=1; spaces<=rows-row; spaces++){
                System.out.print("  ");
            }

            // print hollow square
            for(int stars=1; stars<=rows; stars++){

                if(row==1 || row==rows || stars==1 || stars==rows){
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
        hollow_rhombus(5);
    }
}
