import java.util.*;

public class linearSearch {
    
    // function for linear search
    public static void linear_search(int array1[],Scanner sc){

        System.out.print(" Enter the key which you have to find :- ");
        int Key  = sc.nextInt();

        // loop for comparing key to each element
        for(int i=0; i<array1.length; i++){
            if(array1[i]==Key){
                System.out.println("Found at the index:- " + i);
                break;
            }
            else{
                System.out.println("Not found");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array1[] = {7,8,10,15,17,9};

        //calling linear_search function 
        linear_search(array1, sc);
        
    }
}
