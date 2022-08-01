class Solution {
    public int uniquePathsWithObstacles(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        if(mat[0][0]==1) return 0;
        mat[0][0]=1;
        for(int i=1;i<m;i++){
            if(mat[i][0]==0 && mat[i-1][0]==1) mat[i][0]=1;
            else mat[i][0]=0;
        }
        for(int j=1;j<n;j++){
            if(mat[0][j]==0 && mat[0][j-1]==1) mat[0][j]=1;
            else mat[0][j]=0;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][j]==0)
                    mat[i][j]=mat[i-1][j]+mat[i][j-1];
                else mat[i][j]=0;
            }
        }
        return mat[m-1][n-1];
    }
}