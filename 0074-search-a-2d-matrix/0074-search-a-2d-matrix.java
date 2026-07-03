class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0;
        int low = 0, high = n-1;
        while(low<=high && i<m){
            if(target>matrix[i][n-1]){
                i++;
                if(i>=m) return false;
                continue;
            }

            int mid = low + (high-low)/2;
            if(matrix[i][mid]==target){
                return true;
            } else if(matrix[i][mid]>target){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return false;
    }
}