import java.util.*;

class bas{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        int odd=0;
        int even=0;
        int choice;

        do{
            System.out.println("Enter a number");
            num = sc.nextInt();

            if(num % 2 == 0){
                odd += num;
            }
            else{
                even += num;
            }
            System.out.println("Enter 1 for continue or 0 for stop");
            choice = sc.nextInt();
        }
        while(choice==1);

        System.out.println("Addition of odd is : " +odd);
        System.out.println("Addition of even is : " +even);


    }
}