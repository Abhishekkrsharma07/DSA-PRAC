
// Brutforce method
class DuplicatesBr {
    public static boolean Duplicates(int nums[], int k){
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j] && (j-i)<=k){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args){
        int nums[] = {1,2,4,5,1};
        int k = 6;
        System.out.println(Duplicates(nums, k));
    }
}
