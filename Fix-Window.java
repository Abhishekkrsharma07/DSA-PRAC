class Main{
  public static void main(String[] args){
    int arr[] = {};
    int k=3;
    int n=arr.length;

    for(int i=0;i<=n-k;i++){
      int min = arr[i];
      for(int j=i;j<i+k;j++){
        if(arr[j]<min){
          min=arr[j];
        }
      }
      System.out.println(min+" ");
    }
}
}
