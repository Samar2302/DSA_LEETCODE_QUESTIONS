class Solution {
    public int countBinarySubstrings(String s) {
        int res=0,l=0,curr=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) curr++;
            else{
                res+=Math.min(l,curr);
                l=curr;
                curr=1;
            }
        }
        return res+Math.min(curr,l);
    }
}