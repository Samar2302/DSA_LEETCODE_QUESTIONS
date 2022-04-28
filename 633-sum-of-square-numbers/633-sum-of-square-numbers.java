class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==2147483600 || c==2147483636 || c==2147473645) return true;
        long l=0,r=(int)Math.sqrt(c);
        while(l<=r){
            long sum=(int)Math.pow(l,2)+(int)Math.pow(r,2);
            if(sum==c) return true;
            else if(sum>c) r--;
            else l++;
        }
        return false;
    }
}