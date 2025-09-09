class RansomeNote383 {

    public static boolean formulas(String Ransome, String Magazine){
        int count[] = new int[26];

        for(char c:Magazine.toCharArray()){
            count[c - 'a']++;
        }

        for(char c:Ransome.toCharArray()){
            if(count[c - 'a']==0){
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }
    public static void main(String[] args){
        String Ransome="aa";
        String Magazine="ab";
        System.out.println(formulas(Ransome, Magazine));
    }
}
