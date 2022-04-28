class Solution {
    public boolean dfs(int r,int c,int m,int n,int[][] arr,boolean[][] mark,int mid){
        if(r==m-1 && c==n-1) return true;
        mark[r][c]=true;
        boolean ans=false;
        if(r+1<m && mark[r+1][c]==false && Math.abs(arr[r][c]-arr[r+1][c])<=mid){
            ans=ans||dfs(r+1,c,m,n,arr,mark,mid);
        }
        if(r-1>=0 && mark[r-1][c]==false && Math.abs(arr[r][c]-arr[r-1][c])<=mid){
            ans=ans||dfs(r-1,c,m,n,arr,mark,mid);
        }
        if(c+1<n && mark[r][c+1]==false && Math.abs(arr[r][c]-arr[r][c+1])<=mid){
            ans=ans||dfs(r,c+1,m,n,arr,mark,mid);
        }
        if(c-1>=0 && mark[r][c-1]==false && Math.abs(arr[r][c]-arr[r][c-1])<=mid){
            ans=ans||dfs(r,c-1,m,n,arr,mark,mid);
        }
        return ans;
    }
    public int minimumEffortPath(int[][] h) {
        int l=0,r=Integer.MAX_VALUE,ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(dfs(0,0,h.length,h[0].length,h,new boolean[h.length][h[0].length],mid)){
                ans=Math.min(ans,mid);
                r=mid-1;
            }else l=mid+1;
        }
        return ans;
    }
}