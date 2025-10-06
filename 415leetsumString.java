class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1; // last index of num1
        int j = num2.length() - 1; // last index of num2
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int n1 = (i >= 0) ? num1.charAt(i) - '0' : 0; // get digit or 0
            int n2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = n1 + n2 + carry;
            result.append(sum % 10);   // take last digit
            carry = sum / 10;          // update carry

            i--;
            j--;
        }

        return result.reverse().toString(); // reverse to get final number
    }
}
