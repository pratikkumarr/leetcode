class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        int sum=0;
        solve(ans, curr, sum, candidates, target, 0);
        return new ArrayList<>(ans);
    }

    private void solve(HashSet<List<Integer>> ans, List<Integer> curr, int sum, int[] arr, int target, int idx){
        if(sum==target){ ans.add(new ArrayList<>(curr)); return;}
        if(sum>target) return;
        for(int i=idx; i<arr.length; i++){
            curr.add(arr[i]);
            sum+=arr[i];
            solve(ans, curr, sum, arr, target, i);
            curr.remove(curr.size()-1);
            sum-=arr[i];
        }
    }
}