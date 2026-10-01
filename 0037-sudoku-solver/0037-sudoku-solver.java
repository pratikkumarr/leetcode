class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private static boolean solve(char[][] board, int row, int col){
        if(row==9) return true;
        if(col==9) return solve(board, row+1, 0);

        if(board[row][col]!='.') return solve(board, row, col+1);

        for(int num=1; num<=9; num++){
            if(isSafe(board, row, col, num)){
                board[row][col] = (char)(num + '0');
                if(solve(board, row, col+1)) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col, int num){
        for(int i=0; i<9; i++){
            if(i==row) continue;
            if(board[i][col]==(char)(num + '0')) return false;
        }

        for(int j=0; j<9; j++){
            if(j==col) continue;
            if(board[row][j]==(char)(num + '0')) return false;
        }

        int rowStart = (row/3)*3;
        int colStart = (col/3)*3;

        for(int i=rowStart; i<rowStart+3; i++){
            for(int j = colStart; j<colStart+3; j++){
                if(i==row && j==col) continue;
                if(board[i][j]==(char)(num + '0')) return false;
            }
        }
        return true;
    }
}