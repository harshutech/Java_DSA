import java.util.*;

public class BinomialCofficient {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binoCoeff(int n , int r){
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int n_r  = factorial(n-r);

        int binoCoff = (n_fac/(r_fac*n_r));  

        return binoCoff;
    }

    public static void main(String args[]) {
    
        System.out.print(binoCoeff(5, 2));

                   

    }
}
