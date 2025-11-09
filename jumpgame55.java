class jumpgame55 {
    public static boolean canJump(int[] nums) {
        int maxReach=0;
        for(int i=0;i<=maxReach;i++){
            maxReach = Math.max(maxReach, i+nums[i]);
            if(maxReach >= nums.length-1 ){
                return true;
            }
        }   
        return false;
    }

    public static void main(String[] args){
        int nums[] = {1,2,3,4,5};
        System.out.println("The condition is :" + canJump(nums));
    }
    
}