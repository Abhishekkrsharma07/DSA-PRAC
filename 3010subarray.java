class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0];
// I have taken both the value max which will give me the lowest value in the array and save to min1 and min2.

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<= min1 || nums[i]<=min2){
                min2 = Math.min(min2,min1);
                min1 = nums[i];
            }
        }
        return first+min1+min2;
    }
}
