class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,HashSet<Character>> row=new HashMap<>();
        HashMap<Integer,HashSet<Character>> col=new HashMap<>();
        HashMap<String,HashSet<Character>>  square=new HashMap<>();//string because square is 
    
    for(int r=0;r<9;r++){
        for(int c=0;c<9;c++){
            if(board[r][c]=='.')continue;

            String squarekey= (r/3) + "," + (c/3);

            if(row.computeIfAbsent(r,k -> new HashSet<>()).contains(board[r][c])
            ||  col.computeIfAbsent(c,k -> new HashSet<>()).contains(board[r][c])
            ||  square.computeIfAbsent(squarekey,k-> new HashSet<>()).contains(board[r][c])){

            return false;       
            }

            row.get(r).add(board[r][c]);
            col.get(c).add(board[r][c]);
            square.get(squarekey).add(board[r][c]);
        }
    }
    
    
    
    
    return true;
    
    }
}
