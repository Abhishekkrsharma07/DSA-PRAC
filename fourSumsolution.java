import java.util.*;
class fourSumsolution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length<4) return result;


        Arrays.sort(nums);

        int n = nums.length;

        for(int i=0; i<n-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1; j<n-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int left =j+1;
                int right=n-1;

                while(left<right){
                    long sum=(long) nums[i]+nums[j] + nums[left]+nums[right];

                    if(sum == target){
                        result.add(Arrays.asList(nums[i], nums[j],nums[left],nums[right]));

                        while(left < right && nums[left]==nums[left+1]) left++;

                        while(right <right && nums[right]== nums[right-1]) right--;

                        left++;
                        right--;
                    }
                    else if(sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
     public static void main(String[] args) {
        fourSumsolution solution = new fourSumsolution();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> output = solution.fourSum(nums, target);
        System.out.println(output);
    }
}