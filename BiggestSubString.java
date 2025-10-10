
class BiggestSubString {
    public static String FindSubStr(String str,int si, int ei){
        String subStr = "";
        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    
    public static void main(String[] args) {
        String str = "Hellow_World";
        System.out.println(FindSubStr(str,0,6));
    }
}