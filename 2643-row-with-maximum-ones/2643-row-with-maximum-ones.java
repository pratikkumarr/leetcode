class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int m = mat.length;
        int n = mat[0].length;
        int ans=0;
        for(int i=0; i<m; i++){
            int ones = 0;
            for(int j=0; j<n; j++){
                ones+=mat[i][j];
            }
            if(ones>max){
                max = ones;
                ans = i;
            }
        }
        return new int[]{ans, max};
    }
}