import java.util.*;
class bubble{
    public static void bubblesort(int arr[], int n){
        
        for(int i=n-1; i>=1; i--){
            
            for(int j=0; j<=i-1; j++){
                if(arr[j+1] > arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       
    }
    
    public static void main(String[] args){
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        bubblesort(arr, n);
        System.out.println(Arrays.toString(arr));

    }
}