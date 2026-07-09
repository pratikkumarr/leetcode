class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];

        int n = s.length();

        for(int i=0; i<n; i++){
            if(m1[s.charAt(i)]!=m2[t.charAt(i)]) return false;
            
            m1[s.charAt(i)] = i+1;  // storing i+1 because i=0 will conflict with default array value = 0
            m2[t.charAt(i)] = i+1;
        }
        return true;
    }
}