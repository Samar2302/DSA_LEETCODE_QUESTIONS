class Solution {
    List<String> l=new ArrayList<>();
    public void helper(char[] arr,int n,StringBuilder sb){
        if(sb.length()==n){
            l.add(sb.toString());
            return;
        }
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(sb.length()>0){
                if(sb.charAt(sb.length()-1)=='a' && ch!='e') continue;
                else if(sb.charAt(sb.length()-1)=='e' && (ch=='o'||ch=='u'||ch=='e')) continue;
                else if(sb.charAt(sb.length()-1)=='i' && ch=='i') continue;
                else if(sb.charAt(sb.length()-1)=='o' && (ch=='a' || ch=='e' || ch=='o')) continue;
                else if(sb.charAt(sb.length()-1)=='u' && ch!='a') continue;
            }
            sb.append(ch);
            helper(arr,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public int countVowelPermutation(int n) {
        long[][] dp=new long[n+1][5];
        int a=0,e=1,i=2,o=3,u=4;
        dp[1][a]=1;dp[1][e]=1;dp[1][i]=1;dp[1][o]=1;dp[1][u]=1;
        int mod =(int)(Math.pow(10,9) +7);
        for(int j=2;j<=n;j++){
            dp[j][a]=(dp[j-1][e]+dp[j-1][i]+dp[j-1][u])%mod;
            dp[j][e]=(dp[j-1][a]+dp[j-1][i])%mod;
            dp[j][i]=(dp[j-1][e]+dp[j-1][o])%mod;
            dp[j][o]=dp[j-1][i]%mod;
            dp[j][u]=(dp[j-1][i]+dp[j-1][o])%mod;
        }
        //helper(new char[]{'a','e','i','o','u'},n,new StringBuilder());
        long ans=0;
        for(int j=0;j<5;j++) ans=(ans+dp[n][j])%mod;
        return (int)ans;
    }
}