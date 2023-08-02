public class problem1 {
    
    //bubble sort
    public static void bubble_sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
         System.out.println("Using bubble sort :-");
    }



    //selection sort
    public static void selection_sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] < arr[j]){
                    min = j;
                }
            }

            //swaping
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
         System.out.println("Using selection sort :-");
    }



    //insertion sort
    public static void insertion_sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
        System.out.println("Using insertion sort :-");
    }



    // count sort
    public static void count_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;
            }
        }
        System.out.println("Using count sort :-");
        // System.out.println(largest);
    }


    // function to print array
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3,6,2,1,8,7,4,5,3,1};  // sort this array in decending order
        bubble_sort(arr);
        print(arr);
        selection_sort(arr);
        print(arr);
        insertion_sort(arr);
        print(arr);
        count_sort(arr);
        print(arr);
        
    }
}
