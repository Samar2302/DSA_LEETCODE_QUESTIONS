class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int l=0,r=num/2;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid==num){ return true;}
            else if(mid>num/mid) r=mid-1;
            else l=mid+1;
        }
        return false;
    }
}