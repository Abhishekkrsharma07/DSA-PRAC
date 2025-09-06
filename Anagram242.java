class Anagram242 {

    public static boolean Anagram(String s, String t){
        int count[] = new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int c : count){
            if(c != 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s="abs";
        String t="abs";

        System.out.println(Anagram(s,t));
    }
}
