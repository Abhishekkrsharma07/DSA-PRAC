class SingleNo136 {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
    public static void main(String[] args){
        int nums[] = {2,2,1,5,5};
        System.out.println(singleNumber(nums));
    }
}