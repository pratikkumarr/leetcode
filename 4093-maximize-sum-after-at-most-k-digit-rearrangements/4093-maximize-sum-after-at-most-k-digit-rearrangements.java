class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        long sum=0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int x = rearrange(nums[i]);
            sum+=nums[i];
            arr[i] = x - nums[i];
        }
        Arrays.sort(arr);
        for(int i=n-1; i>=n-k; i--){
            sum+=arr[i];
        }
        return sum;
    }

    private int rearrange(int x){
        int[] freq = new int[10];
        while(x>0){
            freq[x%10]++;
            x/=10;
        }
        x=0;
        for(int i=9; i>=0; i--){
            while(freq[i]>0){
                x=x*10+i;
                freq[i]--;
            }
        }
        return x;
    }
}