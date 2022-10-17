class Solution {
    public int max(int[] arr,int i){
        int max=Integer.MIN_VALUE;
        for(;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
    public int helper(int[] arr,int n,int i,int d,int[][] dp){
        if(d==1){
            return max(arr,i);
        }
        if(dp[i][d]!=-1) return dp[i][d];
        int res=Integer.MAX_VALUE,diff=Integer.MIN_VALUE;
        for(int j=i;j<=n-d;j++){
            diff=Math.max(diff,arr[j]);
            res=Math.min(res,diff+helper(arr,n,j+1,d-1,dp));
        }
        dp[i][d]=res;
        return dp[i][d];
    }
    public int minDifficulty(int[] arr, int d) {
        int[][] dp=new int[301][11];
        for(int i=0;i<301;i++){
            Arrays.fill(dp[i],-1);
        }
        if(arr.length<d) return -1;
        return helper(arr,arr.length,0,d,dp);
    }
}