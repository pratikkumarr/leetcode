class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int low = 0, high = n-1, mid;
        int ans = -1;
        while(low<=high){
            mid = low + (high-low)/2;
            if(letters[mid] > target){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        if(ans==-1) return letters[0];
        return letters[ans];
    }
}