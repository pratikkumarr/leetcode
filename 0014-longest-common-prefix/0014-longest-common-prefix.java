class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String small=strs[0];
        for(String s : strs){
            if(s.length()<small.length()) small = s;
        }
        for(int i=0; i<n; i++){
            for(int k=0; k<small.length(); k++){
                if(small.charAt(k)!=strs[i].charAt(k)){
                    small = small.substring(0, k);
                    break;
                }
            }
        }
        return small;
    }
}