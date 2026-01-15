class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int comp=target-numbers[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp)+1,i+1};
               
            } map.put(numbers[i], i);
            }throw new IllegalArgumentException("noo two sum solutions");
        
    }
}
