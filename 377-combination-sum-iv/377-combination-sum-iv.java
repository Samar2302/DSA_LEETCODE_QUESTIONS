class Solution {
    public int helper(int[] dp,int[] nums,int tar){
        if(dp[tar]!=-1) return dp[tar];
        if(tar==0) return 1;
        int res=0;
        for(int x:nums){
            if(x<=tar)
            res+=helper(dp,nums,tar-x);
        }
        dp[tar]=res;
        return res;
    }
    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
        return helper(dp,nums,target);
    }
}