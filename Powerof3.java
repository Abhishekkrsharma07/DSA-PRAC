public class Powerof3 {
    public static boolean Powerpack(int n){
        if(n == 0){
            return false;
        }

        while(n != 1){
            if(n%3 != 0){
                return false;
            }
            else{
                n=n/3;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n=3;
        System.out.println(Powerpack(n));
    }
}
