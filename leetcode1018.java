class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List <Boolean> result=new ArrayList<>();
         int prefix = 0;

         for(int i=0; i<nums.length;i++){
            prefix = ((prefix<<1)+nums[i])%5;

            result.add(prefix == 0);
         }
         return result;
    }
}