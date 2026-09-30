class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        solve(board, 0, n, ans);
        return ans;
    }

    private static void solve(char[][] board, int row, int n, List<List<String>> ans){
        if(row==n){
            List<String> curr = new ArrayList<>();
            for(int i=0; i<n; i++){
                curr.add(new String(board[i]));
            }
            ans.add(curr);
            return;
        }

        for(int col = 0; col<n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                solve(board, row+1, n, ans);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int n){

        // columns and diagonals - bas upar ke check karenge(kyuki abhi niche pahuche hi nhi hain)
        // row check hi nhi karna kyuki row mein already ek hi queen daal rahe hain

        // column
        for(int i=0; i<row; i++){
            if(board[i][col] == 'Q') return false;
        }

        // upper left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q') return false;
        }

        // upper right diagonal
        for(int i=row-1, j = col+1; i>=0 && j<n; i--, j++){
            if(board[i][j]=='Q') return false;
        }

        return true;
    }
}