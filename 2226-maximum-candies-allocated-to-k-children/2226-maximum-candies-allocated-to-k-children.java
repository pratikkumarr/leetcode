class Solution {
    public boolean isValid(int[] candies, long k, int candy){
        int n = candies.length;
        long child = 0;
        for(int i=0; i<n; i++){
            if(candies[i]>=candy){
                child+=candies[i]/candy;
                if(child>=k) return true;
            }
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int low = 1, high = candies[0];
        for(int i=1; i<n; i++){
            high = Math.max(high, candies[i]);
        }
        int mid = 0, ans = 0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(isValid(candies, k, mid)){
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }
}