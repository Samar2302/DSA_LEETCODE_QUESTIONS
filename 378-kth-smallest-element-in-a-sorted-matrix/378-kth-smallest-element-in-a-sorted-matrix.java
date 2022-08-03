class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        while(low<high){
            int mid=low+(high-low)/2;
            int count=countLess(matrix,mid);
            if(count<k){
                low=mid+1;
            }
            else high=mid;
        }
        return low;
    }
    public int countLess(int[][] mat,int val){
        int count = 0 , len = mat.length, i = len-1, j=0;
        while(i >=0 && j<len){
            if(mat[i][j] > val){
                i--;
            }
            else
            {
                count = count + i +1;
                j++;
            }
        }
        return count;
    }
}