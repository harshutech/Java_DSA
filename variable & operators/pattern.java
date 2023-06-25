import java.util.*;

class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // String input  = sc.next();
        // System.out.println(input);
        // System.out.println("* * * *");
        // System.out.println("* * * ");
        // System.out.println("* * ");
        // System.out.println("*");

       /* byte b = 100;
        System.out.println(b);

        char ch= 'h';
        System.out.println(ch);

        boolean bh=true;
        System.out.println(bh);*/

        // int first_value = 10;
        // int second_value = 20;

        // System.out.println(first_value + second_value);

 
        // int a,b;

        // System.out.println("Enter a value of variable A");
        // a = sc.nextInt();

        // System.out.println("Enter a value of variable b");
        // b = sc.nextInt();

        // System.out.println(a+b);


        // float radius;
        // radius = sc.nextFloat();

        // System.out.println(3.14f * radius * radius);

        // int $ = 20;

        // System.out.println($);

        // int a = 30;
        // int b = ++a;

        // System.out.println(a);
        //         System.out.println(b);

        // if else statment 

        // int age = 17;
        
        // if (age>=18) {
        //     System.out.println("You can vote");
        // } else {
        //     System.out.println("You are not eligible");
        // }

        // int a;

        // System.out.println("Enter any number");
        // a = sc.nextInt();

        // if(a%2 == 0){
        //     System.out.println("EVEN");
        // }
        // else{
        //     System.out.println("ODD");
        // }

        int income;
        int Tax;

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