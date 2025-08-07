
class Palindrome {

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(isPalindrome(num));
    }
}
