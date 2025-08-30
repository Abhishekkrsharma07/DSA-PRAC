import java.util.*;
class HappyNo2 {
    public static boolean isHappy(int n) {
       Set<Integer> contain = new HashSet<>();
       
       while(n != 1 && !contain.contains(n)){
        contain.add(n);
        int sum = 0;


        while(n>0){
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        n=sum;
       }
       return n == 1;
    }

    public static void main(String[] args){
        int n =1;
        System.out.println(isHappy(n));
    }
}