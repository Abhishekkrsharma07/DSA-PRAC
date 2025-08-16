class powerof4{


    public static boolean Values(int n){
        if(n <= 0){
            return false;
        }

        while(n > 1){
            if(n%4 != 0){

                n = n/4;
            }
        }
        
        return true;
    }
    public static void main(String[] args){
        int n=16;
        System.out.println(Values(n));
    }
}