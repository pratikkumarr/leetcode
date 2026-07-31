class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int mid = n/2;
        int ele = nums[mid];
        for(int i=0; i<n; i++){
            if(i!=mid){
                if(nums[i]==ele) return false;
            }
        }
        return true;
    }
}