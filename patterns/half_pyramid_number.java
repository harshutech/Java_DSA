public class half_pyramid_number {
    public static void main(String args[]){

    char ch='A';
    int n = 4;
    for(int line=1; line<=n; line++){
        for(int character=1; character<=line; character++){
            System.out.print(ch);
            ch++;
        }
        System.out.println("");
    }
}
}
 