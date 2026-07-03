class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i=0, j=0;
        List<Integer> arr = new ArrayList<>();
        
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr.add(nums1[i++]);
            } else{
                arr.add(nums2[j++]);
            }
        }
        while(i<m){
            arr.add(nums1[i++]);
        }
        while(j<n){
            arr.add(nums2[j++]);
        }

        int len = arr.size();
        int mid = len/2;
        if(len%2==0) return (float) (arr.get(mid-1) + arr.get(mid))/2;
        return (float) arr.get(mid);
    }
}