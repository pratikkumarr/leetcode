class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Set<Integer> set = new HashSet<>();
        int n = intervals.length;
        int k=0;
        for(int i=0; i<n; i++){
            if(set.contains(i)) continue;
            int l = intervals[i][0];
            int r = intervals[i][1];
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(intervals[i][0]>=intervals[j][0] && intervals[i][1]<=intervals[j][1]){
                    k++;
                    set.add(i);
                    break;
                }
            }
        }
        return n-k;
    }
}