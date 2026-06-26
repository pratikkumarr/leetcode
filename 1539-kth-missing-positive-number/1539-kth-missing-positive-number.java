class Solution {
    public int findKthPositive(int[] arr, int k) {
        int curr = 1, i=0;
        while(true){
            if(i<arr.length && arr[i]==curr){
                i++;
            } else {
                k--;
                if(k==0) return curr;
            }
            curr++;
        }
    }
}