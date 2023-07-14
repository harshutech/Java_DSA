// Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )


public class problem4 {

    public static int sum_num(int num){
        int sum = 0;

        while(num>0){
            int last_digit = num % 10;
            sum += last_digit;
            num = num/10;
        }
        return sum;
    }




    public static void main(String args[]){
        System.out.print(sum_num(12345));
    }
}
