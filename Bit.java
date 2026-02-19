//convert to binary
class Bit{

    public static String Binary(int n){
        String res="";
        while(n!=1){

            if(n%2==0) res+="1";

            else res+="0";
            n=n/2;
        }
        res = new StringBuilder(res).reverse().toString();
        return res;
    }

    public static void main(String[] args){
        int n=20;
        System.out.println(Binary(n));
    }

}