class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0,j=0;i<n;j++,i++){
            for(int k=i;k<n;k++){
                int t=matrix[i][k];
                matrix[i][k]=matrix[k][j];
                matrix[k][j]=t;
            }
        }
        for(int i=0;i<n;i++){
            int j=0,k=n-1;
            while(j<k){
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=t;
                j++;k--;
            }
        }
    }
}