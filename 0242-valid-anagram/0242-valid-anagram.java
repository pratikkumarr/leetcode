class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(m!=n){
            return false;
        }
        int alpha[] = new int[26];
        for(int i=0; i<n; i++){
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(alpha[i]!=0){
                return false;
            }
        }
        return true;
    }
}