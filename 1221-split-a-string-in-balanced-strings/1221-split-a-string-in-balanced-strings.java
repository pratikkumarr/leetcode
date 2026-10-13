class Solution {
    public int balancedStringSplit(String s) {
        int k=0, ans=0;
        for(char c : s.toCharArray()){
            if(c=='L') k++;
            else k--;
            if(k==0) ans++;
        }
        return ans;
    }
}