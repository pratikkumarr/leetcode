class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] jumps = new int[n];
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n && j<i+1+nums[i]; j++){
                if(jumps[j]==0){
                    jumps[j] = jumps[i]+1;
                }
            }
        }
        return jumps[n-1];
    }
}