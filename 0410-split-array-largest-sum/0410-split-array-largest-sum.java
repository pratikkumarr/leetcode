class Solution {
    public int partitions(int[] nums, int limit){
        int parts = 1;
        int sum=0;
        for(int x : nums){
            if(sum+x > limit){
                parts++;
                sum = x;
            } else {
                sum+=x;
            }
        }
        return parts;
    }
    public int splitArray(int[] nums, int k) {
        int low= nums[0], high = nums[0];
        for(int x : nums){
            low = Math.max(low, x);
            high += x;
        }
        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(partitions(nums, mid)<=k){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}