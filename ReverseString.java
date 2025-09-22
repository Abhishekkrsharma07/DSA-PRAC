
class ReverseString {

    public static void Reverse(char[] s){

        int start = 0;
        int end = s.length-1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args){
        char[] s= {'h','e','l','l','o'};
        Reverse(s);
        System.out.println(new String(s));
    }
}
