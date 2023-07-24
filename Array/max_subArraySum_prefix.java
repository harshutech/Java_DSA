import java.util.*;

public class max_subArraySum_prefix {
    

    // function for find sub array of an array
    public static void max_subArray_sum(int array[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        // for prefix array
        for(int i=1; i<array.length; i++){
            prefix[i] = prefix[i-1] + array[i];
        }
 
        // outer loop for nth element
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
               
                current_sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (current_sum > max_sum) {
                    max_sum = current_sum;
                }
            }

        }
        System.out.println("Max subarry sum is = " + max_sum);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };

        max_subArray_sum(array);
    }
}


