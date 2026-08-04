class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int mini = nums[0], maxi = nums[0];
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            mini = Math.min(mini, x);
            maxi = Math.max(maxi, x);
            set.add(x);
        }
        for(int i=mini; i<=maxi; i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}