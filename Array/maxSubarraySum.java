import java.util.*;

public class maxSubarraySum {

    // function for find sub array of an array
    public static void max_subArray_sum(int array[]) {
        int current = 0;
        int max_sum = Integer.MIN_VALUE;

        // outer loop for nth element
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                current = 0;
                for (int k = i; k <= j; k++) {
                    current += array[k];
                }
                System.out.println(current);
                if (current > max_sum) {
                    max_sum = current;
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
