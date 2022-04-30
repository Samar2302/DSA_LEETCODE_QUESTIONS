class Solution {
    int count=0;
    public String sub(String str,StringBuilder sb,int n,int k,char last){
        if(sb.length()==n){
            count++;
            if(count==k) return sb.toString();
            return "";
        }
        for(int i=0;i<str.length();i++){
            if(last==str.charAt(i)) continue;
            sb.append(str.charAt(i));
            String s=sub(str,sb,n,k,str.charAt(i));
            if(!s.isEmpty()) return s;
            sb.setLength(sb.length()-1);
        }
        return "";
    }
    public String getHappyString(int n, int k) {
        return sub("abc",new StringBuilder(),n,k,' ');
    }
}