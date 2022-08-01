class Solution {
    public int helper(int i,int j,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1) return 1;
        if(i==m && j<n) return 0;
        if(j==n && i<m) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        
        dp[i][j]+=helper(i+1,j,m,n,dp) + helper(i,j+1,m,n,dp);
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return helper(0,0,m,n,dp);
    }
}