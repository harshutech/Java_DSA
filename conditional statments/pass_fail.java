import java.util.Scanner;

public class pass_fail {
        public static void main(String args[]){
        
            Scanner sc = new Scanner(System.in);

            int marks;

            System.out.println("Enter a marks of student");
            marks = sc.nextInt();

            String result = (marks>=33) ? "Pass" : "Fail" ;
            System.out.println(result);

        }
}
