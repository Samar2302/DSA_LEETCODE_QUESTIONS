class Solution {
    public int arrangeCoins(int n) {
        int st=1,next=n-st;
        while(st<next){
            st+=1;
            next=next-st;
        }
        return st;
    }
}