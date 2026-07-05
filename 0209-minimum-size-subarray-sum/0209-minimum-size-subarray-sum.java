class Solution {
    boolean isValid(int target, int[] nums, int x){
        int sum=0, n = nums.length;
        int count=1;
        int i=0;
        while(i<n && count<=x){
            sum+=nums[i++];
            count++;
        }
        if(sum>=target) return true;
        for(; i<n; i++){            
            sum += nums[i];
            sum -= nums[i-x];
            if(sum>=target) return true;
        }
        return false;
    }
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0, high = n, mid;
        int ans=0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(isValid(target, nums, mid)){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}