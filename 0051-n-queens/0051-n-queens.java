// class Solution {
//     void isSafe(int[][] board,int row,int col,int n){
//         for(int i=col-1;i>=0;i++){
//             if(board[i][col]=='Q') return false;
//         for(int i){

//         }        
//         for(int i){
            
//         }
//     }
//     }
//     void solve(char[][] board,int row){
//         if(row==n){

//         }
//         for(int col=0;i<n;i++){
//             if(isSafe(board,row,col,n)){
//             board[row][i]='Q';
//             solve(board,row+1);
//             board[row][i]='.';
//             }
//         }
//     }
//     public List<List<String>> solveNQueens(int n) {
//         List<List<Integer>> ans=new List<>();
//         char board[][]=new char[n][n];
//         for(int i=0;i<n;i++){
//             Arrays.fill(board[i],'.');
//         }
//         solve(board,0);
        
//     }
// }

import java.util.*;

class Solution {
    List<List<String>> result = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n];
        boolean[] diag2 = new boolean[2 * n];
        
        backtrack(0, board, col, diag1, diag2, n);
        return result;
    }
    
    private void backtrack(int row, char[][] board,
                           boolean[] col,
                           boolean[] diag1,
                           boolean[] diag2,
                           int n) {
        
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board) {
                temp.add(new String(r));
            }
            result.add(temp);
            return;
        }
        
        for (int c = 0; c < n; c++) {
            
            if (col[c] || diag1[row + c] || diag2[row - c + n])
                continue;
            
            board[row][c] = 'Q';
            col[c] = true;
            diag1[row + c] = true;
            diag2[row - c + n] = true;
            
            backtrack(row + 1, board, col, diag1, diag2, n);
            
            board[row][c] = '.';
            col[c] = false;
            diag1[row + c] = false;
            diag2[row - c + n] = false;
        }
    }
}

