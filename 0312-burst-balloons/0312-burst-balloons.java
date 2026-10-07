class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+2];
        arr[0] = 1;
        arr[n+1] = 1;
        for(int i=0; i<n; i++){
            arr[i+1] = nums[i];
        }
        int[][] dp = new int[n+2][n+2];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(arr, 0, n+1, dp);
    }

    private int solve(int[] arr, int i, int j, int[][] dp){
        if(i+1 == j) return 0;
        if(dp[i][j]!=-1) return  dp[i][j];

        int max=-1;

        for(int k=i+1; k<j; k++){
            int coins = solve(arr, i, k, dp) + solve(arr, k, j, dp) + arr[i]*arr[k]*arr[j];
            max = Math.max(max, coins);
        }
        return dp[i][j] = max;
    }
}