import java.util.*;

class largest{

    public static void largest1(int array1[]){

        int largest = Integer.MIN_VALUE; // used for store -infinity value

        for(int i=0; i<array1.length; i++){
            if(largest < array1[i]){
                largest = array1[i];
            }
        }

        System.out.println("Largest value in array is :- " + largest);
    }




    public static void main(String[] args) {
        int array1[] = {1,2,3,6,4,4};

        largest1(array1);
    }
}