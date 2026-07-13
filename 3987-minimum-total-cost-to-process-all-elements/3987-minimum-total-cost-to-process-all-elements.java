class Solution {
    public int minimumCost(int[] nums, int k) {
        final long MOD = 1_000_000_007L;
        long cost = 1, reso = k, ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > reso) {
                long reqd = nums[i] - reso;
                long ops = (reqd + k - 1) / k;

                // Compute sum = cost + (cost+1) + ... + (cost+ops-1) safely mod MOD
                long a = cost % MOD;
                long b = (cost + ops - 1) % MOD;
                long cnt = ops % MOD;
                // (a+b) and cnt each < MOD (~1e9), product < 1e18, safe for long
                long termSum = ((a + b) % MOD) * cnt % MOD;
                // divide by 2 under modulo: multiply by modular inverse of 2
                long inv2 = (MOD + 1) / 2; // 500000004
                termSum = termSum * inv2 % MOD;

                ans = (ans + termSum) % MOD;

                reso += ops * k;
                cost += ops;
            }
            reso -= nums[i];
        }
        return (int) (ans % MOD);
    }
}