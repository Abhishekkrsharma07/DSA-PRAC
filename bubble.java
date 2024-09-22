class bubble {
    public static void PrintArry(int arr[]) {

        
        for(int i=0;i<arr.length;i++){
        
        System.out.println(arr[i]+" ");
    }
    System.out.println();
}

public static void main(String []args){

    int i,j;
    
    int arr[]={1,3,4,7,8,7};
    //bubble sort
    
    for(i=0;i<arr.length-i;i++){
            for(j=0;j<arr.length-i-1;j++){
    
                if(arr[j]>arr[j+1]){
                    //Now we can swap with the old method which we have learn in basics;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        PrintArry(arr);
}
}
