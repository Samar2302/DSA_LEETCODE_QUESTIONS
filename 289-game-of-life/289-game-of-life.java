class Solution {
    public int getLive(int[][] board,int i,int j){
        int l=0;
        if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1) l++;
        if(i+1<board.length && j+1<board[0].length && board[i+1][j+1]==1) l++;
        if(i-1>=0 && j+1<board[0].length && board[i-1][j+1]==1) l++;
        if(i+1<board.length && j-1>=0 && board[i+1][j-1]==1) l++;
        if(i-1>=0&& board[i-1][j]==1) l++;
        if(i+1<board.length&& board[i+1][j]==1) l++;
        if(j-1>=0 && board[i][j-1]==1) l++;
        if(j+1<board[0].length && board[i][j+1]==1) l++;
        return l;
    }
    public void gameOfLife(int[][] board) {
        int[][] aux=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int l=0;
                if(board[i][j]==0){
                    l=getLive(board,i,j);
                    if(l==3) aux[i][j]=1;
                }else{
                    l=getLive(board,i,j);
                    if(l<2) aux[i][j]=0;
                    else if(l==2 || l==3) aux[i][j]=1;
                    else aux[i][j]=0;
                }
            }
        }
        for(int i=0;i<aux.length;i++){
            for(int j=0;j<aux[0].length;j++) board[i][j]=aux[i][j];
        }
    }
}