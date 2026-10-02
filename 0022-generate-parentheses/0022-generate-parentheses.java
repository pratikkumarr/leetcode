class Solution {
    public List<String> generateParenthesis(int n) {
        int open =0, close = 0;
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(n, open, close, ans, sb);
        return ans;
    }
    private void solve(int n, int open, int close, List<String> ans, StringBuilder sb){
        if(open==n && close==n){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            solve(n, open+1, close, ans, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open>close){
            sb.append(')');
            solve(n, open, close+1, ans, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}