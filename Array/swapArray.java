public class swapArray {
    
    //swap array function
    public static void swap(int array[]){
        int head = 0, tail=array.length-1;

        while(head < tail){
            int temp = 0;

            temp = array[head];
            array[head]=array[tail];
            array[tail]=temp;

            head++;
            tail--;
        }
    }



    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};

        swap(array);

        for(int i=0; i<array.length; i++){

            System.out.print(array[i]+" ");
        }
    }
}
