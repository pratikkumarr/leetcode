class Solution {
    public boolean divideArray(int[] nums) {
        int[] count = new int[501];
        for(int x : nums) count[x]++;
        for(int n : count) if(n%2!=0) return false;
        return true;
    }
}