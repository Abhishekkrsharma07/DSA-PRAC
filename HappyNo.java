import java.util.*;
class HappyNo {
    public static boolean HappyNumber(int n){
        Set<Integer> contain = new HashSet<>();
        while(true){
            int sum = 0;
            while(n !=0){
                sum += Math.pow(n%10, 2.0);
                n=n/10;
            }
            if(sum == 1)
            return true;

            if(contain.contains(n))
            return false;
            contain.add(n);
        }

    }

    public static void main (String [] args){
        int n = 1;
        System.out.println(HappyNumber(n));
    }
}
