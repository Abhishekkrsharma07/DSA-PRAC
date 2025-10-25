class Solution {
    public int firstUniqChar(String s) {
        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            count[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i) - 'a']== 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String s = "leetcode";
        Solution sol = new Solution();
        System.out.println(sol.firstUniqChar(s)); 
    }
}

