class Solution {
    public int numSplits(String s) {
        int ans=0;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        map1.put(s.charAt(0),1);
        for(int i=1;i<s.length();i++) 
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        if(map1.size()==map2.size()) ans++;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            if(map2.containsKey(ch) && map2.get(ch)-1==0) map2.remove(ch);
            else map2.put(ch,map2.get(ch)-1);
            if(map1.size()==map2.size()) ans++;
        }
        return ans;
    }
}