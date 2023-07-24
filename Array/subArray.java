public class subArray {

    // function for find sub array of an array
    public static void sub_array(int array[]){

        // outer loop for nth element
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(array[k] + " ");     
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    


    public static void main(String[] args) {
        int array[]= {2,4,6,8,10};

        sub_array(array);
    }
}
