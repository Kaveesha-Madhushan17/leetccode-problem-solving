package Leet_code_150.src.p007_valid_sudoku_leetcode_36;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char number = board[i][j];

                if(number != '.'){
                    int boxInd = (i/3)*3 + (j/3);
                    if(!seen.add(number+"in row" + i) || !seen.add(number + "in colomn" +j) || !seen.add(number + "inbox"+boxInd)){
                        return false;
                    }
                }
            }

        }
        return true;
    }
}