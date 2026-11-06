class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // row check
        for(int i = 0; i < board.length; i++){
            Set<Character> row = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){
                if (board[i][j] != '.') {
                    if (row.contains(board[i][j])) {
                        return false;
                    }
                    row.add(board[i][j]);
                }
            }
        }

        // collumn check
        for(int i = 0; i < board.length; i++){
            Set<Character> collumn = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){
                if(board[j][i] != '.'){
                    if(collumn.contains(board[j][i])){
                        return false;
                    }
                    collumn.add(board[j][i]);
                }
            }
        }

        //square check
        for(int i = 0; i < board.length; i++){
            Set<Character> square = new HashSet<>();
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    int row = (i / 3) * 3 + j;
                    int col = (i % 3) * 3 + k;
                    if(board[row][col] != '.'){
                        if(square.contains(board[row][col])){
                            return false;
                        }
                        square.add(board[row][col]);
                    }
                }
            }
        }

        return true;
    }


}
