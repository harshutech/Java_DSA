public class bubble_sort{

    // code function for bubble sort
    public static void bubbleSort(int arr[]){
        int count = 0;
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count ++;
                }
            }
        }
        System.out.println("Swaping done" + count + " Times");
    }

    // advance code for optime bubble sort for already sorted array -> assumed tc-0(n) 
    public static void optmizeBubbleSort(int arr[]){
        int n = arr.length;
        boolean is_sorted = false ;
    
        for(int i=1; i<n; i++){

            if(arr[i] > arr[i-1]){
                is_sorted = true ;
            }
            else{
                is_sorted = false;
            }
            
        }

        if(is_sorted == false){
            int count = 0;
        
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-1-i; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        count ++;
                    }
                }
            }
            System.out.println("Swaping done" + count + " Times");
        }

        else{
            System.out.println("Array already sorted");
        }
        
    }

    //function for print array
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }






    public static void main(String[] args) {
        
        int arr[] = {2,3,4,1};

        // bubbleSort(arr);
        optmizeBubbleSort(arr);
        print(arr);
    }
}