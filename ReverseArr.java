// Rotate an array
import java.util.Arrays;
class main{
    public static int[] rotate(int nums[], int k){
        
        int n = nums.length;
        if(n==0) return nums;
        k = k%n;
        
        if(k==0) return nums;
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
        return nums;
    }
    public static void reverse(int nums[], int start, int end){
       while(start < end){
        start = 0;
        end = nums.length-1;

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
       }
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }
}