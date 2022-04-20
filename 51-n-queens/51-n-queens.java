class Solution {
    public boolean isSafe(int r,int c,char[][] board,int n){
        int dr=r,dc=c;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q') return false;
            r--;c--;
        }
        r=dr;c=dc;
        while(c>=0){
            if(board[r][c]=='Q') return false;
            c--;
        }
        c=dc;
        while(r<n && c>=0){
            if(board[r][c]=='Q') return false;
            r++;c--;
        }
        return true;
    }
    public void helper(int col,char[][] board,List<List<String>> ans,int n){
        if(col==n){
            List<String> al=new ArrayList<>();
            for(char[] arr:board){
                al.add(new String(arr));
            }
            ans.add(al);
            return;
        }
        for(int r=0;r<n;r++){
            if(isSafe(r,col,board,n)){
                board[r][col]='Q';
                helper(col+1,board,ans,n);
                board[r][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) board[i][j]='.';
        }
        helper(0,board,ans,n);
        return ans;
    }
}