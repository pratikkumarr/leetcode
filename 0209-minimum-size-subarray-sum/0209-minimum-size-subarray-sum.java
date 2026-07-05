class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left =0, sum=0, ans=n+1;
        for(int right = 0; right<n; right++){
            sum+=nums[right];
            while(sum>=target){
                ans = Math.min(ans, right-left+1);
                sum-=nums[left++];
            }
        }
        if(ans>n) return 0;
        return ans;
    }
}