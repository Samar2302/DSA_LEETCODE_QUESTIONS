class Solution {
    char[] arr={'a','e','i','o','u'};
    int ans=0;
    public void helper(int n,char last,int idx){
        if(n==0 || last>arr[idx]){
            ans+= n==0?1:0;
            return;
        }
        for(int i=idx;i<arr.length;i++){
                helper(n-1,arr[i],i);
        }
        //return ans;
    }
    public int countVowelStrings(int n) {
        helper(n,' ',0);
        return ans;
    }
}