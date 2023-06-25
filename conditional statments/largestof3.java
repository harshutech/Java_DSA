import java.util.Scanner;

public class largestof3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int first_num, second_num, third_num;

        System.out.println("Enter a first number");
        first_num = sc.nextInt();

        System.out.println("Enter a second number");
        second_num = sc.nextInt();

        System.out.println("Enter a third number");
        third_num = sc.nextInt();

        if(first_num >= second_num && first_num >= third_num){
            System.out.println("largest number is :" + first_num);
        }
        else if(second_num >= third_num){
            System.out.println("largest number is :" +second_num);
        }
        else{
            System.out.println("largest number is :" +third_num);
        }

    }
}
