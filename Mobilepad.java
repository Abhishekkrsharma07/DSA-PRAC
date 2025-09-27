import java.util.*;

class MobilePad {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;

        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        backtrack(digits, 0, hm, new StringBuilder(), ans);
        return ans;
    }

    private static void backtrack(String digits, int i, HashMap<Character, String> hm, StringBuilder sb, List<String> ans) {
        if (i == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        String curr = hm.get(digits.charAt(i));
        for (int k = 0; k < curr.length(); k++) {
            sb.append(curr.charAt(k)); // choose
            backtrack(digits, i + 1, hm, sb, ans); // explore
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }
    public static void main(String[] args) {
        MobilePad sol = new MobilePad();

        // Example input
        String digits = "23";
        List<String> result = sol.letterCombinations(digits);

        System.out.println("Input: " + digits);
        System.out.println("Output: " + result);
    }
}
