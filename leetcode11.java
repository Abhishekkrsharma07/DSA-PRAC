class leetcode11 {
    public static int maxArea(int[] height) {  // in leetcode we donot use static fun because we only need to
                                                   // provide the method to solve the problem
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;


        while(left < right){
            int h = Math.min(height[left], height[right]);
            int width = right-left;
            int area = h*width;
            maxArea = Math.max(maxArea, area);



            if(height[left] < height[right]){
                left++;
            } 
            else{
                right--;
            }
        }   
        return maxArea;
}

public static void main(String[] args){
    int height[]={1,4,3,7,6,8,4,5};
    System.out.println(maxArea(height));
}
}