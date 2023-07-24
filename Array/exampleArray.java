import java.util.*;

class exampleArray{
    

    // passing array as an argument to print array elements
    public static void example(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    // loop for update array elements
     public static void update(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+1 + " ");
        }
    }

    // loop for taking input in array 
     public static void input(int array[], Scanner sc){
        
        for(int i=0; i<array.length; i++){
            
            array[i] = sc.nextInt();
        }
    }



    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        

        int array1[] = {1,2,3,4,5};
        int array2[] = new int[10];

        // update(array1);
        input(array2,sc);
        example(array2);
        
    }
}