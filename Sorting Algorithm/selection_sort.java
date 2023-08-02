

public class selection_sort {

    // code function for selection sort
    public static void selectionSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int minimum = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minimum] > arr[j]){
                    minimum = j;
                }
            }
            // swaping
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }

    }

    //function to print array
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        
        selectionSort(arr);
        print(arr);





        
    }
}
