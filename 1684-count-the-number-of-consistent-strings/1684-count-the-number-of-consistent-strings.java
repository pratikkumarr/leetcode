class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for (String s : words) {
            boolean consistent = true;
            for (char c : s.toCharArray()) {
                if (allowed.indexOf(c) == -1) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) ans++;
        }
        return ans;
    }
}