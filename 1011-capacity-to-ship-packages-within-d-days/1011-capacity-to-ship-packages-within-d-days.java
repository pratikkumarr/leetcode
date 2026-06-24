class Solution {
    public int day(int[] arr, int capacity){
        int days=1, sum=0;
        for(int x : arr){
            if(sum+x>capacity){
                days++;
                sum=0;
            }
            sum += x;
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = weights[0], high = weights[0], mid, ans = 1;
        for(int i=1; i<n; i++){
            low = Math.max(weights[i], low);
            high += weights[i];
        }
        while(low<=high){
            mid = low + (high-low)/2;
            if(day(weights, mid)<=days){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}