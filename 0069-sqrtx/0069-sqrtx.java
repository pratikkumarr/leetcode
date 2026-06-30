class Solution {
    public int mySqrt(int x) {
        int low = 0, high = x/2;
        if(x<=1) return x;
        int mid, ans=0;
        while(low<=high){
            mid = low + (high-low)/2;
            long k = (long)mid*mid;
            if(k == x) return mid;
            else if(k < x){
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }
}