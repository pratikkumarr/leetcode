class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = n-1;
        double ans = (double)(nums[left]+nums[right])/2;
        left++; right--;
        while(left<right){
            double avg = (double)(nums[left]+nums[right])/2;
            ans = Math.min(ans, avg);
            left++;
            right--;
        }
        return ans;
    }
}