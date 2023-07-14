//  Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

public class problem3 {
    

    public static boolean is_palindrome (int num){

        int reverse = 0;
        int user_given = num;

        while(user_given != 0){
            int last_digit = user_given %10;
            reverse = (reverse * 10)+last_digit;
            user_given = user_given / 10;
        }
        if(num == reverse){
            return true;
        }
        else{
            return false;
        }
        

        
    }


    public static void main(String args[]){

       System.out.print( is_palindrome(121));

    }
}
