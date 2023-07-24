public class pairsInArray {
    
    // function for print pairs of array elements
    public static void pairs(int array[]){
        //outer loop 
        int totalPairs = 0;
        for(int i=0; i<array.length; i++){
            int current = array[i];
            //inner loop
            for(int j=i+1; j<array.length; j++){
                System.out.print("("+ current + "," + array[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Toal pairs are = "+ totalPairs);
    }

    // total pairs formula = n(n-1)/2;



    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};

        pairs(array);
    }
}
