import java.util.*;

public class Kedanes {    


    // time complexity -> 0(n)
    //Kedanes algorithm
    public static void kedanes_algo(int array[]){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){
            current_sum = current_sum + array[i];

            if(current_sum < 0 ){
                current_sum = 0;
            }
            max_sum = Math.max(max_sum, current_sum);
        }
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };

        kedanes_algo(array);
    } 
}

