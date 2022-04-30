class Solution {
    public String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        int l=0,r=sb.length()-1;
        while(l<r){
            char ch=sb.charAt(l);
            sb.setCharAt(l,str.charAt(r));
            sb.setCharAt(r,ch);
            l++;r--;
        }
        return sb.toString();
    }
    public List<String> subdomainVisits(String[] cp) {
        Map<String, Integer> map=new HashMap<>();
        for(String str:cp){
            StringBuilder sb=new StringBuilder();
            int num=0,i=0;
            for(i=0;i<str.length();i++){
                if(str.charAt(i)==' ') break;
                num=num*10+str.charAt(i)-'0';
            }
            for(int j=str.length()-1;j>i;j--){
                char ch=str.charAt(j);
                if(ch=='.'){
                    String s=reverse(sb.toString());
                    if(!map.containsKey(s))
                        map.put(s,num);
                    else map.put(s,map.get(s)+num);
                    sb.append(ch);
                }else sb.append(ch);
            }
            String s=reverse(sb.toString());
            if(!map.containsKey(s))
                map.put(s,num);
            else map.put(s,map.get(s)+num);
        }
        List<String> ans=new ArrayList<>();
        for(Map.Entry<String,Integer> x:map.entrySet()){
            ans.add(x.getValue()+" "+x.getKey());
        }
        return ans;
    }
}