class Solution {
    public int helper(int i,int j,int m,int n,int[][] mat,int[][] dp){
        if(i==m-1 && j==n-1){
            if(mat[i][j]==1) return 0;
            else return 1;
        }
        if(i==m && j<n) return 0;
        if(i<m && j==n) return 0;
        if(mat[i][j]==1) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        dp[i][j]+= helper(i+1,j,m,n,mat,dp)+helper(i,j+1,m,n,mat,dp);
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] mat) {
        int[][] dp=new int[mat.length][mat[0].length];
        return helper(0,0,mat.length,mat[0].length,mat,dp);
    }
}