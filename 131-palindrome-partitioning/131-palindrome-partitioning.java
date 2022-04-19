class Solution {
    List<List<String>> ans=new ArrayList<>();
    public boolean isPalin(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public void helper(String s,int  idx,ArrayList<String> al){
        if(idx==s.length()){
            ans.add(new ArrayList<String>(al));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalin(s,idx,i)){
                al.add(s.substring(idx,i+1));
                helper(s,i+1,al);
                al.remove(al.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        helper(s,0,new ArrayList<String>());
        return ans;
    }
}