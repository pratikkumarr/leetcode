class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int max = 0;
            for(int i=1; i<m; i++){
                if(mat[i][mid]>mat[max][mid]){
                    max = i;
                }
            }
            int curr = mat[max][mid];
            int left;
            if(mid==0) left = -1;
            else left = mat[max][mid-1];
            int right;
            if(mid==n-1) right = -1;
            else right = mat[max][mid+1];
            if(curr> left && curr>right){
                return new int[]{max, mid};
            }
            if(left>curr){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}