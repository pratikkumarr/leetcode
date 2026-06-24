class Solution {
    public int divide(int[] arr, int x){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += (arr[i] + x - 1)/x;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
       int n = nums.length;
       int low = 1, high = nums[0], mid;
       for(int i=1; i<n; i++){
        high = Math.max(high, nums[i]);
       }
       int ans =0;

       while(low<=high){
        mid = low + (high-low)/2;
        if(divide(nums,mid)<=threshold){
            ans = mid;
            high = mid-1;
        } else {
            low = mid+1;
        }
       }
       return ans;
    }
}