class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int low = 0, high = n-1, mid;
        int first=-1, last=-1;
        while(low<=high){
            mid = low + (high-low)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid-1;
            } else if(nums[mid]<target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        low=0; high = n-1;
        while(low<=high){
            mid = low + (high-low)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid+1;
            } else if(nums[mid]<target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        if(first==-1) return ans;
        while(first<=last){
            ans.add(first++);
        }
        return ans;
    }
}