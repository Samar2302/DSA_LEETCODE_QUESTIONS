class Solution {
    List<String> ans=new ArrayList<>();
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void helper(String d,StringBuilder sb,int idx){
        if(idx==d.length()){
            ans.add(new String(sb.toString()));
            return ;
        }
        int n=d.charAt(idx)-'0';
        for(int i=0;i<map[n].length();i++){
            sb.append(map[n].charAt(i));
            helper(d,sb,idx+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        helper(digits,new StringBuilder(),0);
        return ans;
    }
}