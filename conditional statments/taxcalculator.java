import java.util.*;

class taxcalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

            int income;
            // int Tax;

            System.out.println("Enter your income (Anual)");
            income = sc.nextInt();

            if(income < 500000){
                System.out.println("You are Tax free");
            }
           else if(income > 500000 && income < 1000000){
                System.out.println("You have o pay Tax : " + income*(0.2));
            }
            else{
                System.out.println("You have to pay Tax : " + income*(0.3));
            }
    }
}