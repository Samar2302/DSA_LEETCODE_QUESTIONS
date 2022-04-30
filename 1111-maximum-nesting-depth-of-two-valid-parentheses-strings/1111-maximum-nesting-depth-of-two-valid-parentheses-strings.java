class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int curr=0,max=0;
        int[] ans=new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='(') {ans[i]=curr;curr++;}
            else {curr--;ans[i]=curr;}
            max=Math.max(curr,max);
        }
        int t=max/2;
        for(int i=0;i<seq.length();i++){
            if(ans[i]>=t) ans[i]=1;
            else ans[i]=0;
        }
        return ans;
    }
}