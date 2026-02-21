// Majority Element

class main{
  public static int MaximumNumber(int nums[]){
    int majority = nums[0];
    int votes = 1;

    for(int i=i;i<nums.length;i++){
      if(votes==0){
        votes++;
        majority = nums[i];
      }
      else if(majority==nums[i]){
        votes++;
      }
      else{
        votes--;
      }
    }
    return majority;
  }

  public static void main(String[] args){
    int nums[] = {1,2,3,2,5,6,2,2};
    System.out.println(MaximumBumber(nums));
  }
}
