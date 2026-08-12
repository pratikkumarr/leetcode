class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n= nums.length, ans = 0, left=0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int right=0; right<n; right++){
            int num = nums[right];
            freq.put(num, freq.getOrDefault(num, 0)+1);
            while(freq.get(num)>k){
                freq.put(nums[left], freq.get(nums[left])-1);
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}