class Solution {
    public boolean exist(char[][] board, String word) {
        int m  = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    visited[i][j] = true;
                    boolean ans=false;
                    ans = solve(board, word, 1, visited, i, j);
                    if(ans) return true;
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }

    static boolean solve(char[][] board, String word, int idx, boolean[][] visited,int i, int j){
        if(idx==word.length())return true;
        if(i>0 && !visited[i-1][j] && board[i-1][j]==word.charAt(idx)){
            visited[i-1][j] = true;
            boolean ans = solve(board, word, idx+1, visited, i-1, j);
            visited[i-1][j] = false;
            if(ans) return true;
        }
        if(i<board.length-1 && !visited[i+1][j] && board[i+1][j]==word.charAt(idx)){
            visited[i+1][j] = true;
            boolean ans = solve(board, word, idx+1, visited, i+1, j);
            visited[i+1][j] = false;
            if(ans) return true;
        }
        if(j<board[0].length-1 && !visited[i][j+1] && board[i][j+1]==word.charAt(idx)){
            visited[i][j+1] = true;
            boolean ans = solve(board, word, idx+1, visited, i, j+1);
            visited[i][j+1] = false;
            if(ans) return true;
        }
        if(j>0 && !visited[i][j-1] && board[i][j-1]==word.charAt(idx)){
            visited[i][j-1] = true;
            boolean ans = solve(board, word, idx+1, visited, i, j-1);
            visited[i][j-1] = false;
            if(ans) return true;
        }
        return false;
    }
}