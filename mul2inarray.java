class mul2inarray{

    public static int Values(int[] nums,int original){
        for(int i=0;i<nums.length;i++){
            if(original == nums[i]){
                original = original*2;
                i=-1; // Stsrting from start
            }
        }
        return original;
    }

    public static void main(String[] args){
        int[] nums= {1,2,4,6,8};
        int original = 90;
        System.out.println(Values(nums,original ));
    }
}