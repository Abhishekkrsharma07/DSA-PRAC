public class Poweof2 {


    public static boolean Powerpack(int n){
        if(n == 0){
            return false;
        }

        while(n != 1){
            if(n%2 != 0){
                return false;
            }
            else{
                n=n/2;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(Powerpack(n));
    }
}
