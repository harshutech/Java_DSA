import java.util.*;

public class product {

    public static int product_(int first_value,int second_value){

        return (first_value*second_value);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int first_value = sc.nextInt();
        int second_value = sc.nextInt();

        int product_sum =  product_(first_value,second_value);

        System.out.println("Product of given no is : " + product_sum);

    
    }
}
