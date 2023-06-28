public class reverse_number {
    public static void main(String args[]){

    int number = 8112001;

    while(number>0){
        int last_digit = number % 10;
        System.out.print(last_digit);
        number = number / 10;
    }
}
}
