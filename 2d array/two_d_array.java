import java.util.*;
class two_d_array{

    // function to search key element
    public static boolean search(int matrix[][] , int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at Index "+ i +","+j);
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    // function to find largest and smalles element in 2d array
        public static void largest_smallest(int matrix[][]){
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               largest = Math.max(largest, matrix[i][j]);
               smallest = Math.min(smallest,matrix[i][j]);
            }
        }
        System.out.println("Largest element is " + largest);
        System.out.println("smallest element is " + smallest);

       
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = 3, m = 3, key = 1;

        // take user input in 2d array 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }    
        }

        // print elements of 2d array 
         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }   
            System.out.println();
        }

        search(matrix, key);
        largest_smallest(matrix);

    }
}