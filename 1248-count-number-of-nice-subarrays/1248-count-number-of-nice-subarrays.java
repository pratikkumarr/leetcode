class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }

    private int atMost(int[] arr, int k){
        int left=0;
        int ans=0;
        int odds=0;
        for(int right=0; right<arr.length; right++){
            if(arr[right]%2==1) odds++;
            while(odds>k){
                if(arr[left]%2==1) odds--;
                left++;
            }
            ans+=right-left+1;
        }
        return ans;
    }
}