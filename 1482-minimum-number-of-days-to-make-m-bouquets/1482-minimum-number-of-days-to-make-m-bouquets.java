class Solution {
    public boolean isValid(int[] arr, int day, int m, int k){
        int n = arr.length;
        int bouq=0, flowers=0;
        for(int i=0; i<n; i++){
            if(arr[i]<=day){
                flowers++;
                if(flowers==k){
                    bouq++;
                    if(bouq==m) return true;
                    flowers=0;
                }
            } else {
                flowers=0;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<m*k) return -1;
        int low = bloomDay[0], high = bloomDay[0];
        for(int x : bloomDay){
            low = Math.min(low, x);
            high = Math.max(high, x);
        }
        int mid, ans=-1;
        while(low<=high){
            mid = low + (high-low)/2;
            if(isValid(bloomDay, mid, m, k)){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}