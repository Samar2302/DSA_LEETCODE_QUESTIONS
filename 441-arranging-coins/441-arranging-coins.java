class Solution {
    public int arrangeCoins(int n) {
        int ans=0;
        while(ans<n){
            ans++;
            n-=ans;
        }
        return ans;
    }
}