class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map  = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(0, ans, digits, map, sb);
        return ans;
    }

    private void solve(int idx, List<String> ans, String digits, String[] map, StringBuilder sb){
        if(idx==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String temp = map[digits.charAt(idx) - '0'];

        for(int i=0; i<temp.length(); i++){
            sb.append(temp.charAt(i));
            solve(idx+1, ans, digits, map, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

}