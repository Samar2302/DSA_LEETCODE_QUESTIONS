class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
       int l=1,r=x;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid==x) return mid;
            else if(mid>x/mid) r=mid-1;
            else l=mid+1;
        }
        return r;
    }
}