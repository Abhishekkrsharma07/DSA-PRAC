class Arrayss{
    public static int TrapRainWater(int height[]){
        int n=height.length;
        //left Max;

        int leftMax[]= new int[n];
        leftMax[0]=height[n-1];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i], leftMax[n-1]);
        }
        
        //rightMax;
        int rightMax[]= new int[n];
        rightMax[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trapedwater=0;
        for (int i=0;i<n;i++){
            int WaterLevel= Math.max(leftMax[i], rightMax[i]);
            trapedwater +=WaterLevel-height[i];
        }

        return trapedwater;
        //lops

    }
    public static void main(String[] args){
        int height[]= {4,2,0,6,3,2,5};
        System.out.println(TrapRainWater(height));
    }
}