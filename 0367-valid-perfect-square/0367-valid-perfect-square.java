class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0, high = num/2;
        if(num<=1) return true;
        int mid, ans=0;
        while(low<=high){
            mid = low + (high-low)/2;
            long k = (long)mid*mid;
            if(k == num) return true;
            else if(k < num){
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return false;
    }
}